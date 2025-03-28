package Loja_online.Loja_online.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "pessoas")
@Data
public class Pessoas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String cfp;
    private  String email;
    private String senha;
    private String cep;
    private Date datacriacao;
    private Date dataAlteracao;


}
