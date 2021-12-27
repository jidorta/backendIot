package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import models.UsuarioDA;

public interface IUsuarios extends CrudRepository<UsuarioDA, Long> {

}
