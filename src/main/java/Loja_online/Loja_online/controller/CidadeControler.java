package Loja_online.Loja_online.controller;


import Loja_online.Loja_online.entity.Cidade;
import Loja_online.Loja_online.entity.Estado;
import Loja_online.Loja_online.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/cidade")
@RestController
@CrossOrigin
public class CidadeControler {

    @Autowired
    private CidadeService cidadeService;

    // BUSCAR TODAS AS CIDADE//
    @CrossOrigin
    @GetMapping("/")
    public ResponseEntity<List<Cidade>> searchCity() {
        List<Cidade> cidades = cidadeService.searchCity();
        return ResponseEntity.ok(cidades);

    }

    @PostMapping("/")
    public ResponseEntity<Cidade> insertCity(@RequestBody Cidade cidade) {
        Cidade cidade1 = cidadeService.insertCity(cidade);
        return ResponseEntity.ok(cidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removecity(@PathVariable Long id) {
        cidadeService.removecity(id);
        return ResponseEntity.noContent().build();
    }


}