package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Stagiaire;

public interface IDAOStagiaire extends JpaRepository<Stagiaire, Integer>{

}
