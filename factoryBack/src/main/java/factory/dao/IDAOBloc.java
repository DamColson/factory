package factory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import factory.model.Bloc;

public interface IDAOBloc extends JpaRepository<Bloc, Integer> {

}
