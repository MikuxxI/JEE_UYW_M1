package MRUYW.UYW.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import MRUYW.UYW.model.Game;

public interface IGameRepository extends JpaRepository<Game, Integer> {

}
