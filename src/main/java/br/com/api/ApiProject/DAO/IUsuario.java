package br.com.api.ApiProject.DAO;

import br.com.api.ApiProject.Model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
