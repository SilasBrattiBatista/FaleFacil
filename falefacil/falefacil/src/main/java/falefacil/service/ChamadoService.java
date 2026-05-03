package falefacil.service;

import falefacil.model.Chamado;
import falefacil.model.Usuario;
import falefacil.repository.ChamadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoService {

    private final ChamadoRepository chamadoRepository;

    public ChamadoService(ChamadoRepository chamadoRepository) {
        this.chamadoRepository = chamadoRepository;
    }

    public List<Chamado> listarTodos() {
        return chamadoRepository.findAll();
    }

    public Chamado buscarPorId(int id) {
        return chamadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Chamado não encontrado"));
    }

    public Chamado criarChamado(Chamado chamado) {
        return chamadoRepository.save(chamado);
    }

    public void deletarChamado(int id) {
        chamadoRepository.deleteById(id);
    }

    public void atualizarDescricao(int id, String descricao) {
        Chamado chamado = chamadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chamado não encontrado"));
        chamado.setDescricao(descricao);
        chamadoRepository.save(chamado);
    }

    public void atualizarUsuarioResponsavel(int id, Usuario usuarioResponsavel) {
        Chamado chamado = chamadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chamado não encontrado"));
        chamado.setUsuarioResponsavel(usuarioResponsavel);
        chamadoRepository.save(chamado);
    }

    public void atualizarStatus(int id, String status) {
        Chamado chamado = chamadoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chamado não encontrado"));
        chamado.setStatus(status);
        chamadoRepository.save(chamado);
    }

}
