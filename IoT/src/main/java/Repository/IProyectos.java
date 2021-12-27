package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import models.ProyectoDA;

public interface IProyectos extends CrudRepository<ProyectoDA, Long> {



}
