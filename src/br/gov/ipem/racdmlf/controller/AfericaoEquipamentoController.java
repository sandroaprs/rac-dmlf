package br.gov.ipem.racdmlf.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.gov.ipem.racdmlf.model.AfericaoEquipamento;

public class AfericaoEquipamentoController {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	
	public AfericaoEquipamentoController(){
		emf = Persistence.createEntityManagerFactory("AfericaoEquipamento");
		em = emf.createEntityManager();
	}
	
	
	public void salvar(AfericaoEquipamento afericaoEquipamento ){
		em.getTransaction().begin();
		em.merge(afericaoEquipamento);
		em.getTransaction().commit();
		em.close();
			
	}

	public void remover(){
		em.getTransaction().begin();
		Query q = em.createNamedQuery("delete FROM afericaoequipamento WHERE data  BETWEEN ('2019-05-01') AND ('2019-10-13')");
		em.getTransaction().commit();
		em.close();
			
	}
	
	
	
}
