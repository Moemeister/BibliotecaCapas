package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "Libro")
public class Book {

	@Id
	@GeneratedValue(generator="libro_id_book_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "libro_id_book_seq", sequenceName = "public.libro_id_book_seq", allocationSize = 1)
	@Column(name = "id_book")
	private int id;
	
	@Column(name="title")
	private String titulo;
	
	@Column(name= "autor")
	private String autor;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="stock")
	private String stock;
	
	@Column(name="genre")
	private String genero;
	
	public Book() {}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getStock() {
		return stock;
	}

	public String getGenero() {
		return genero;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
