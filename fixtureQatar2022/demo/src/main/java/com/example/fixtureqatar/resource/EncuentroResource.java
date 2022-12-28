package com.example.fixtureqatar.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fixtureqatar.entity.Encuentro;
import com.example.fixtureqatar.repository.IEncuentroRepository;

@RestController
@RequestMapping("/fixture/v1")
public class EncuentroResource {
	@Autowired
	private IEncuentroRepository encuentroRepository;
	
	@GetMapping("/encuentros")
	public List<Encuentro> findAll(){
		return encuentroRepository.findAll();
	}
		
	@PostMapping("/encuentros")
	public Encuentro create(@RequestBody Encuentro encuentro) {
		return encuentroRepository.save(encuentro);
	}
	
	@PutMapping("/encuentros/{id}")
	public Encuentro update(@RequestBody Encuentro encuentro, @PathVariable Integer id ) {
		Encuentro encuentroBase=encuentroRepository.getOne(id);
		encuentroBase.setFechayhoraencuentro(encuentro.getFechayhoraencuentro());
		encuentroBase.setNombrelocal(encuentro.getNombrelocal());
		encuentroBase.setNombrevisitante(encuentro.getNombrevisitante());
		encuentroBase.setGrupo(encuentro.getGrupo());
		encuentroBase.setEstadio(encuentro.getEstadio());
		encuentroBase.setTanteadorL90(encuentro.getTanteadorL90());
		encuentroBase.setTanteadorv90(encuentro.getTanteadorv90());
		encuentroBase.setTanteadorl120(encuentro.getTanteadorl120());
		encuentroBase.setTanteadorlp(encuentro.getTanteadorlp());
		encuentroBase.setTanteadorvp(encuentro.getTanteadorvp());
		encuentroBase.setGanador(encuentro.getGanador());
		encuentroBase.setFase(encuentro.getFase());
		return encuentroRepository.save(encuentroBase);
	}
	
	@DeleteMapping("/encuentros/{id}")
	public void delete(@PathVariable Integer id) {
		encuentroRepository.deleteById(id);
	}
		
	

}
