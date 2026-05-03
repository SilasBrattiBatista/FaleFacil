package falefacil.controller;

import falefacil.model.CategoriaChamado;
import falefacil.service.CategoriaChamadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoriaChamado")
public class CategoriaChamadoController {
    private final CategoriaChamadoService categoriaChamadoService;

    public CategoriaChamadoController(CategoriaChamadoService categoriaChamadoService) {
        this.categoriaChamadoService = categoriaChamadoService;
    }

    @GetMapping
    public ResponseEntity<List<CategoriaChamado>> listarTodos() {
        return ResponseEntity.ok(categoriaChamadoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaChamado> buscarPorId(@PathVariable int id) {
        return ResponseEntity.ok(categoriaChamadoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<CategoriaChamado> criarCategoriaChamado(@RequestBody CategoriaChamado categoriaChamado) {
        categoriaChamadoService.criarCategoriaChamado(categoriaChamado);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleterCategoriaChamado(@PathVariable int id) {
        categoriaChamadoService.deletarCategoriaChamado(id);
        return ResponseEntity.noContent().build();
    }
}
