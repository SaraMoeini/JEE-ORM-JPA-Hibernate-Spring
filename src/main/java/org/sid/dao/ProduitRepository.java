package org.sid.dao;

import java.util.List;

import org.sid.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	
	@Query("SELECT p FROM Produit p WHERE p.designation LIKE :x")
	public List<Produit> produitsParMC(@Param("x")String mc);//x dans le requete represente mc 
}
