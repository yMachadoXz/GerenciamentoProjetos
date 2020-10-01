package br.com.gerenciamentoprojetos.repository;

import br.com.gerenciamentoprojetos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public List findByCargo(String cargo);
	public List findByCargoNot(String cargo);

}
