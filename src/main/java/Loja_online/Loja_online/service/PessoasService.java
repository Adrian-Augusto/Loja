package Loja_online.Loja_online.service;


import Loja_online.Loja_online.entity.Pessoas;
import Loja_online.Loja_online.repository.Pessoasrepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class PessoasService {

    @Autowired
    private Pessoasrepository pessoasrepositoery;


    public List<Pessoas> listarPessoas() {
        return pessoasrepositoery.findAll();

    }

    public Pessoas consultarPessoas(Long id) {
        return pessoasrepositoery.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada!"));
    }

    public Pessoas alterar(Pessoas pessoas) {
        pessoas.setDataAlteracao(new Date()); // Atualiza a data de alteração
        return pessoasrepositoery.save(pessoas); // Salva as alterações no banco
    }

    // Excluir uma pessoa pelo ID
    public void excluir(Long id) {
        Pessoas pessoas1 = pessoasrepositoery.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada!")); // Se não encontrar, lança um erro
        pessoasrepositoery.delete(pessoas1); // Exclui a pessoa do banco
    }}