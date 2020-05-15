package org.sid;

import java.util.List;

import org.sid.dao.EntityRepository;
import org.sid.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AJpa1Application {

	private static final String EntityRepository = null;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AJpa1Application.class, args);
		EntityRepository<Produit> produitDao=ctx.getBean(EntityRepository.class); 
		produitDao.save(new Produit("LX456", 8000,7));
		produitDao.save(new Produit("HP 654", 8000,7));
		produitDao.save(new Produit("HP 786 ", 8000,7));
		
		List<Produit> produits = produitDao.findAll();
		for(Produit p:produits) {
			System.out.println("Designation : "+ p.getDesignation());
			System.out.println("Prix : "+ p.getPrix());
		}
	}

}
