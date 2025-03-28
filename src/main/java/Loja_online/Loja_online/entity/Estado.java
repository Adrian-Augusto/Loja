package Loja_online.Loja_online.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

import java.util.Date;


@Entity
@Table (name ="estado")
@Data

public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nome;
    private  String sigla;
    @Temporal(TemporalType.TIMESTAMP)
    private  Date   dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)

    private  Date   atualizacao;

}
