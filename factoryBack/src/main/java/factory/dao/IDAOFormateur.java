package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Formateur;

public interface IDAOFormateur extends JpaRepository<Formateur, Integer> {

}
