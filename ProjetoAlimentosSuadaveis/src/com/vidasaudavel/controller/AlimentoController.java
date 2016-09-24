package com.vidasaudavel.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;
import com.vidasaudavel.model.Alimento;
import com.vidasaudavel.service.AlimentoService;

@Controller
@ManagedBean(name = "alimentoController")
@SessionScoped
public class AlimentoController {

	private AlimentoService alimentoService;

	public void setAlimentoService(AlimentoService alimentoService) {
		this.alimentoService = alimentoService;
	}

	public void addAlimento(Alimento a) {
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		this.alimentoService.addAlimento(a);
	}

	public List<Alimento> listAlimento() {

		return this.alimentoService.listAlimento();

	}

	public void updateAlimento(Alimento a) {
	
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		this.alimentoService.updateAlimento(a);
	}

	public void removeAlimentoById(int id) {
	
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		this.alimentoService.removeAlimentoById(id);
	}

}
