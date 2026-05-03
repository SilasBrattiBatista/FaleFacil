package falefacil.repository;

import falefacil.model.CategoriaChamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaChamadoRepository extends JpaRepository<CategoriaChamado, Integer> {
}
