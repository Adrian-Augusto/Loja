package Loja_online.Loja_online.repository;

import Loja_online.Loja_online.entity.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface Pessoasrepository extends JpaRepository <Pessoas, Long> {
}
