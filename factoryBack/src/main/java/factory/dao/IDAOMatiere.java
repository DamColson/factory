package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Matiere;

public interface IDAOMatiere extends JpaRepository<Matiere, Integer>{

}
