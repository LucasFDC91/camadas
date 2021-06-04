package br.org.serratec.backend.repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Usuario findByEmail(String email);
	public Usuario getByEmail(String email);
}
