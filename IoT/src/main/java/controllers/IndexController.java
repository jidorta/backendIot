package controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Repository.IProyectos;
import Repository.IUsuarios;
import Repository.ProyectosImpl;
import models.ProyectoDA;
import models.UsuarioDA;

@RestController
@RequestMapping(path = "/proyectos")
public class IndexController implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
    private ProyectosImpl proyectosImpl;
	
	@GetMapping(value = "/proyectosiot", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Iterable<ProyectoDA> getproyectos() {
               
		return  proyectosImpl.findAll();
	}
	
	
	@GetMapping(value = "/proyectosiot", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Optional<ProyectoDA> getproyecto(Long id) {
               
		return proyectosImpl.findById(id);
	}
	
	@PostMapping(value = "/proyectosiotnuevo", produces = { MediaType.APPLICATION_JSON_VALUE })
	public void settproyect(  ProyectoDA proyecto) {
               
		
		proyectosImpl.save(proyecto);
		}
	
	
	
	
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
