package MRUYW.UYW.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import MRUYW.UYW.model.Game;

public interface IGameRepository extends JpaRepository<Game, Integer> {

        // Récupère les 6 jeux pour la parti
        public List<Game> findAll();
}
