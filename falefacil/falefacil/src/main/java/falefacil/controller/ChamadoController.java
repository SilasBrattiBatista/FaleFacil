package falefacil.controller;

import falefacil.model.Chamado;
import falefacil.service.ChamadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chamados")
public class ChamadoController {
    private final ChamadoService chamadoService;

    public ChamadoController(ChamadoService chamadoService) {
        this.chamadoService = chamadoService;
    }

    @GetMapping
    public ResponseEntity<List<Chamado>> listarChamados() {
        return ResponseEntity.ok(chamadoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chamado> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok(chamadoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Chamado> criarChamado(@RequestBody Chamado chamado) {
        chamadoService.criarChamado(chamado);
        return ResponseEntity.noContent().build();
    }

    //Serve tanto para alterar o Responsável quanto o status
    @PostMapping("/{id}")
    public ResponseEntity<Chamado> atualizarChamado(@PathVariable int id, @RequestBody Chamado chamado) {
        chamadoService.criarChamado(chamado);
        return  ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Chamado> deletarChamado(@PathVariable int id) {
        chamadoService.deletarChamado(id);
        return ResponseEntity.noContent().build();
    }
}
