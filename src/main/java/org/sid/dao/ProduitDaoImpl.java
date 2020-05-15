package org.sid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.sid.entities.Produit;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProduitDaoImpl implements EntityRepository<Produit>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Produit save(Produit p) {
		em.persist(p);
		return p;
	}

	@Override
	public List<Produit> findAll() {
		Query req=em.createQuery("select p from Produit p");	//requete en format HQL
		return req.getResultList();
	}

	@Override
	public Produit findById(Long id) {
		Produit p = em.find(Produit.class, id);
		return p;
	}

	@Override
	public Produit findByDesignation(String mc) {
		Query req = em.createQuery("SELECT p FROM Produit WHERE p.designation LIKE :x");
		req.setParameter("x",mc);
		return null;
	}

	@Override
	public Produit update(Produit p) {
		em.merge(p);
		return p;
	}

	@Override
	public void delete(Long id) {
		Produit p = em.find(Produit.class, id);
		em.remove(p);
	}

}
