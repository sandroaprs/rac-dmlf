package br.gov.ipem.racdmlf.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**	
*
* @author Sandro Souza
*/
public class Conexao {
    
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
	
	public static EntityManager getEntityManager() {
		return em;
	}	
	
	public static void conectar() {
		
		if(emf == null && em == null) {
			emf = Persistence.createEntityManagerFactory("racxml");
			em = emf.createEntityManager();	
		}

	}
	
    public static void desconectar() {
        em.close();
        emf = null;
        em = null;
        
    }
}
