package MRUYW.UYW.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import MRUYW.UYW.model.Ressource;

public interface IRessourceRepository extends JpaRepository<Ressource, Integer> {
    
}
