package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import factory.model.Formateur;
import factory.model.Ordinateur;
import jakarta.transaction.Transactional;

public interface IDAOOrdinateur extends JpaRepository<Ordinateur, Integer>{

	@Query("update Ordinateur o set o.formateur=null where o.formateur = :formateur")
	@Modifying
	@Transactional
	public void cascadeNull(@Param("formateur") Formateur formateur);
}
