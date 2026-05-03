package falefacil.service;

import falefacil.model.CategoriaChamado;
import falefacil.repository.CategoriaChamadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaChamadoService {

    private final CategoriaChamadoRepository categoriaChamadoRepository;

    public CategoriaChamadoService(CategoriaChamadoRepository categoriaChamadoRepository) {
        this.categoriaChamadoRepository = categoriaChamadoRepository;
    }

    public List<CategoriaChamado> listarTodos() {
        return categoriaChamadoRepository.findAll();
    }

    public CategoriaChamado buscarPorId(int id) {
        return categoriaChamadoRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Categoria de chamado não encontrado"));
    }

    public CategoriaChamado criarCategoriaChamado(CategoriaChamado categoriaChamado) {
        return categoriaChamadoRepository.save(categoriaChamado);
    }

    public void deletarCategoriaChamado(int id) {
        categoriaChamadoRepository.deleteById(id);
    }
}
