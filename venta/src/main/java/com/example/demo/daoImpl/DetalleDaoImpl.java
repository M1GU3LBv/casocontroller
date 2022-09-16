package com.example.demo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.All;
import com.example.demo.entity.Detalle;

@Component
public class DetalleDaoImpl implements All<Detalle>{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Detalle> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT id_detalle, detalle.precio, cantidad, venta.fecha, producto.nombre FROM ventas.detalle \r\n"
				+ "inner join ventas.venta \r\n"
				+ "ON id_venta = venta.idventa\r\n"
				+ "inner join ventas.producto\r\n"
				+ "On id_producto = producto.idproducto;", new BeanPropertyRowMapper<Detalle>(Detalle.class));
	}

}
