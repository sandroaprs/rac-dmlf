package br.gov.ipem.racdmlf.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.gov.ipem.racdmlf.config.Conexao;
import br.gov.ipem.racdmlf.model.AfericaoEquipamento;
import br.gov.ipem.racdmlf.util.ConverterDataUtil;

public class AfericaoEquipamentoDAO {

	public void salvar(List<AfericaoEquipamento> listaAfericaoEquipamento) {
		
		EntityManager em = Conexao.getEntityManager();
		
		deleteByDate(listaAfericaoEquipamento);
		
		em.getTransaction().begin();

		listaAfericaoEquipamento.forEach(item -> {
			em.merge(item);
		});

		em.getTransaction().commit();

	}

	public void salvar(AfericaoEquipamento afericaoEquipamento) {
		
		EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(afericaoEquipamento);
		em.getTransaction().commit();


	}

	public void deleteByDate(List<AfericaoEquipamento> listaAfericaoEquipamento) {
		
		AtomicLong dateStart = new AtomicLong(0);
		AtomicLong dateEnd = new AtomicLong(0);
		
		listaAfericaoEquipamento.forEach(item -> {
			LocalDate dataItem = ConverterDataUtil.parseLocalDate(item.getData());
			
			if(dateStart.get() == 0L || ConverterDataUtil.parseLocalDate(dateStart.get()).isAfter(dataItem)) {
				dateStart.set(item.getData().getTime());
			}
			
			if(ConverterDataUtil.parseLocalDate(dateEnd.get()).isBefore(dataItem)) {
				dateEnd.set(item.getData().getTime());
			}
			
		});
		
		String dateStartS = ConverterDataUtil.parseLocalDate(dateStart.get()).toString();
		String dateEndS = ConverterDataUtil.parseLocalDate(dateEnd.get()).toString();
		
		EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		Query q = em.createNativeQuery(
				"delete FROM afericaoequipamento WHERE data  BETWEEN ('" + dateStartS + "') AND ('" + dateEndS + "')");
		q.executeUpdate();
		em.getTransaction().commit();
	}

}
