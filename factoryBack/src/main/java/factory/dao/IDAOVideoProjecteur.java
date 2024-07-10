package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.VideoProjecteur;

public interface IDAOVideoProjecteur extends JpaRepository<VideoProjecteur, Integer> {

	public VideoProjecteur findByFormateur(Integer id);
}
