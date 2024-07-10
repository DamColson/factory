package factory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Bloc;

public interface IDAOBloc extends JpaRepository<Bloc, Integer> {

	public List<Bloc> findByFormateur(Integer id);
}
