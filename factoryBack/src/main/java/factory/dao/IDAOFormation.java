package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Formation;

public interface IDAOFormation extends JpaRepository<Formation, Integer> {

}
