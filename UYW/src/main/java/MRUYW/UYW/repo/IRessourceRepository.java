package MRUYW.UYW.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MRUYW.UYW.model.Ressource;

public interface IRessourceRepository extends JpaRepository<Ressource, Integer> {
    
    // Récupère les 6 jeux pour la parti
    public List<Ressource> findAll();
    
}
