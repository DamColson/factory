package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Gestionnaire;

public interface IDAOGestionnaire extends JpaRepository<Gestionnaire, Integer>{

}
