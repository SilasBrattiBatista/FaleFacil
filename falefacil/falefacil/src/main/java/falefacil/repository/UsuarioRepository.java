package falefacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import falefacil.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
