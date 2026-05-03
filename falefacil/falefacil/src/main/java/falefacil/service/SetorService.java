package falefacil.service;

import falefacil.model.Setor;
import falefacil.repository.SetorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {

    private final SetorRepository setorRepository;

    public SetorService(SetorRepository setorRepository) {
        this.setorRepository = setorRepository;
    }

    public List<Setor> listarTodos(){
        return setorRepository.findAll();
    }

    public Setor buscarPorId(int id) {
        return setorRepository.findById(id).orElseThrow(() -> new RuntimeException("Setor não encontrado"));
    }

    public Setor criarSetor(Setor setor) {
        return setorRepository.save(setor);
    }

    public void deletarSetor(int id) {
        setorRepository.deleteById(id);
    }
}
