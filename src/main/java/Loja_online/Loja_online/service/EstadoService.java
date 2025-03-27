package Loja_online.Loja_online.service;

import Loja_online.Loja_online.entity.Estado;
import Loja_online.Loja_online.repository.Estadorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private Estadorepository estadorepository;

    public List<Estado> buscarTodos() {
        return estadorepository.findAll();
    }

    public Estado inserir(Estado estado) {
        estado.setDataCriacao(new Date());
        return estadorepository.saveAndFlush(estado);
    }

    public Estado alterar(Estado estado) {
        estado.setAtualizacao(new Date());
        return estadorepository.saveAndFlush(estado);
    }

    public void excluir(Long id) {
        Optional<Estado> estado = estadorepository.findById(id);
        estado.ifPresent(estadorepository::delete);
    }
}
