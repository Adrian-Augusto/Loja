package Loja_online.Loja_online.controller;

import Loja_online.Loja_online.entity.Estado;
import Loja_online.Loja_online.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RequestMapping("/api/estado")
@RestController
public class EstadoControler {

    @Autowired
    private EstadoService estadoService;

    // Buscar todos os estados
    @GetMapping("/")
    public ResponseEntity<List<Estado>> buscarTodos() {
        List<Estado> estados = estadoService.buscarTodos();
        return ResponseEntity.ok(estados);
    }

    // Inserir um novo estado
    @PostMapping ("/")
    public ResponseEntity<Estado> inserir(@RequestBody Estado estado) {
        Estado novoEstado = estadoService.inserir(estado);
        return ResponseEntity.ok(novoEstado);
    }

    // Alterar um estado existente
    @PutMapping ("/")
    public ResponseEntity<Estado> alterar(@RequestBody Estado estado) {
        Estado estadoAlterado = estadoService.alterar(estado);
        return ResponseEntity.ok(estadoAlterado);
    }

    // Excluir um estado
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        estadoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
