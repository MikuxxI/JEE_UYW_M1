package MRUYW.UYW.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import MRUYW.UYW.model.Team;

public interface ITeamRepository extends JpaRepository<Team, Integer> {

    // Récupère les 20 plus gros score réalisés par des joueurs seuls
    public List<Team> findTop20ByIsPlayerIsTrueOrderByScoreDesc();

    // Récupère les 20 plus gros score réalisés par des équipes
    public List<Team> findTop20ByIsPlayerIsFalseOrderByScoreDesc();
    
}
