package com.generation.dplca.appdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleOrden")
public class DetalleOrdenModel {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (unique = true, nullable = false)
	private Long id;
	private String NombreDetalleOrden;
	
	/**************RELACIONES**********************/
	
	@OneToOne
	private OrdenModel orden;
	@OneToOne
	private ProductoModel producto;
	/*****************************************/

	public DetalleOrdenModel() {
		
	}
	public ProductoModel getProducto() {
		return producto;
	}
	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}
	public DetalleOrdenModel(Long id, String nombreDetalleOrden, OrdenModel orden) {
		
		this.id = id;
		NombreDetalleOrden = nombreDetalleOrden;
		this.orden = orden;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreDetalleOrden() {
		return NombreDetalleOrden;
	}
	public void setNombreDetalleOrden(String nombreDetalleOrden) {
		NombreDetalleOrden = nombreDetalleOrden;
	}
	public OrdenModel getOrden() {
		return orden;
	}
	public void setOrden(OrdenModel orden) {
		this.orden = orden;
	}
	
	
}
