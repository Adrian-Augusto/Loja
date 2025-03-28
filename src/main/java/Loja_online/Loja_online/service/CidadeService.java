package Loja_online.Loja_online.service;

import Loja_online.Loja_online.entity.Cidade;
import Loja_online.Loja_online.entity.Estado;
import Loja_online.Loja_online.repository.Cidaderepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class CidadeService {

    @Autowired
  private   Cidaderepository cidaderepository;



    public List<Cidade> searchCity(){
        return cidaderepository.findAll();

    }


    public Cidade insertCity(Cidade cidade){
         cidade.setDataCriacao(new Date());
        return cidaderepository.saveAndFlush(cidade);

    }
    public Cidade Changes(Cidade cidade){
        cidade.setAtualizacao(new Date());
         return cidaderepository.saveAndFlush(cidade);


    }

    public  void removecity(Long id){
        Optional<Cidade> cidade = cidaderepository.findById(id);
        cidade.ifPresent(cidaderepository::delete);


    }




}
