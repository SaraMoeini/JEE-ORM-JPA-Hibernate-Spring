package org.sid;

import java.util.List;

import org.sid.dao.CategorieRepository;
import org.sid.dao.ProduitRepository;
import org.sid.entities.Categorie;
import org.sid.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AJpa1Application {

	private static final String EntityRepository = null;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AJpa1Application.class, args);
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class); 
		CategorieRepository categorieRepository = ctx.getBean(CategorieRepository.class); 
		
		Categorie c1 = new Categorie("Ordinateurs");
		Categorie c2 = new Categorie("Imprimantes");
		Categorie c3 = new Categorie("Logiciels");
		
		categorieRepository.save(c1);
		categorieRepository.save(c2);
		categorieRepository.save(c3);
		
		produitRepository.save(new Produit("LX456", 8000,7,c2));
		produitRepository.save(new Produit("HP 654", 7500,7,c2));
		produitRepository.save(new Produit("HP 786 ", 6000,7,c2));
		produitRepository.save(new Produit("Thinkpad ", 6000,7,c1));
		produitRepository.save(new Produit("Microsoft Office ", 600,7,c3));
		
		List<Produit> produits = produitRepository.produitsParMC("%H%"); 
		for(Produit p:produits) {
			System.out.print("Designation : "+ p.getDesignation());
			System.out.println("\tPrix : "+ p.getPrix());
		}
	}

}
