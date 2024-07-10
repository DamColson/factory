package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Ordinateur;

public interface IDAOOrdinateur extends JpaRepository<Ordinateur, Integer>{

	public Ordinateur findByFormateur(Integer id);
}
