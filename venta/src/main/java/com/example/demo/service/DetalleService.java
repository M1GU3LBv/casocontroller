package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.All;
import com.example.demo.daoImpl.DetalleDaoImpl;
import com.example.demo.entity.Detalle;

@Service
public class DetalleService implements All<Detalle>{
	@Autowired
	private DetalleDaoImpl daoIMpl;
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
		return daoIMpl.readAll();
	}

}
