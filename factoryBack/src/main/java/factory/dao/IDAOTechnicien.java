package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Technicien;

public interface IDAOTechnicien extends JpaRepository<Technicien, Integer> {

}
