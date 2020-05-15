package org.sid.dao;

import java.util.List;
 
public interface EntityRepository<T> {
/*
 * On a declare une interface generic a la place de ca:
 * public interface ProduitDao              
 */
	public T save(T p);
	public List<T> findAll();
	public T findById (Long id);
	public T findByDesignation(String mc);
	public T update(T p);
	public void delete(Long id);
	
}
