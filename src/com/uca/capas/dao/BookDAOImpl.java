package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Book;


@Repository
public class BookDAOImpl implements BookDAO{

	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Book> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.Libro");
		Query query = entityManager.createNativeQuery(sb.toString(),Book.class);
		List<Book> resulset= query.getResultList();
		
		return resulset;
	}

	@Override
	public Book findOne(Integer codigo) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInteger availableAuthors() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select count(distinct autor) from public.Libro");
		Query query = entityManager.createNativeQuery(sb.toString());
		BigInteger resulset= (BigInteger) query.getSingleResult();
		
		return resulset;
	}

	@Override
	public BigInteger sumStock() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select sum(stock) from public.Libro");
		Query query = entityManager.createNativeQuery(sb.toString());
		BigInteger resulset= (BigInteger) query.getSingleResult();
		
		return resulset;
	}
	
}
