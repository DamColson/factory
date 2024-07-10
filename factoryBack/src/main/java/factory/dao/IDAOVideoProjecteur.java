package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import factory.model.Formateur;
import factory.model.VideoProjecteur;
import jakarta.transaction.Transactional;

public interface IDAOVideoProjecteur extends JpaRepository<VideoProjecteur, Integer> {
	
	@Query("update VideoProjecteur v set v.formateur=null where v.formateur = :formateur")
	@Modifying
	@Transactional
	public void cascadeNull(@Param("formateur") Formateur formateur);
}
