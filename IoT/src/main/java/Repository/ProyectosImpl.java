package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import models.ProyectoDA;

public class ProyectosImpl implements IProyectos{

	@Autowired
    private IProyectos iProyectos;
	
	public  Iterable<ProyectoDA> saveAll(List<ProyectoDA> entities) {
		
		return iProyectos.saveAll(entities);
	}

	@Override
	public Optional<ProyectoDA> findById(Long id) {
		
		return iProyectos.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return iProyectos.existsById(id);
	}

	@Override
	public Iterable<ProyectoDA> findAll() {
		// TODO Auto-generated method stub
		return iProyectos.findAll();
	}

	@Override
	public Iterable<ProyectoDA> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return iProyectos.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return iProyectos.count();
	}

	@Override
	public void deleteById(Long id) {
		iProyectos.deleteById(id);
		
	}

	@Override
	public void delete(ProyectoDA entity) {
		iProyectos.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		iProyectos.deleteAllById(ids);
		
	}

	@Override
	public void deleteAll(Iterable<? extends ProyectoDA> entities) {
		iProyectos.deleteAll();
		
	}

	@Override
	public void deleteAll() {
		iProyectos.deleteAll();
		
	}

	@Override
	public <S extends ProyectoDA> Iterable<S> saveAll(Iterable<S> entities) {
		
		return iProyectos.saveAll(entities);
	}

	@Override
	public <S extends ProyectoDA> S save(S entity) {
		
		return iProyectos.save(entity);
	}
}
