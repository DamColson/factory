package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Salle;

public interface IDAOSalle extends JpaRepository<Salle, Integer>{

}
