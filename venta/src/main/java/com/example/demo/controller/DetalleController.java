package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Detalle;
import com.example.demo.service.DetalleService;



@RestController
public class DetalleController {
	@Autowired
	private DetalleService detalleservice;
	@GetMapping("/detalle")
	public List<Detalle> getList(){
		return detalleservice.readAll();
	}
	
	
}
