package factory.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Competence;
import factory.model.Formateur;

public interface IDAOCompetence extends JpaRepository<Competence, Integer>{

	public List<Competence> findByFormateurs(Formateur formateur);
}
