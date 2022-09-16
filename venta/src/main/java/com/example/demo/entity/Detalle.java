package com.example.demo.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Detalle implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id_detalle;
	private String precio;
	
	private int cantidad;
	private String fecha;
	private String nombre;
	public int getId_detalle() {
		return id_detalle;
	}
	public void setId_detalle(int id_detalle) {
		this.id_detalle = id_detalle;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
