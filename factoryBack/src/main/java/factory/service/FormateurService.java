package factory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import factory.dao.IDAOBloc;
import factory.dao.IDAOCompetence;
import factory.dao.IDAOFormateur;
import factory.dao.IDAOOrdinateur;
import factory.dao.IDAOVideoProjecteur;
import factory.model.Bloc;
import factory.model.Formateur;
import factory.model.Ordinateur;
import factory.model.VideoProjecteur;

@Service
public class FormateurService {

	
	@Autowired
	private IDAOFormateur daoFormateur;
	@Autowired
	private IDAOOrdinateur daoOrdinateur;
	@Autowired
	private IDAOBloc daoBloc;
	@Autowired
	private IDAOVideoProjecteur daoVideoProjecteur;
	@Autowired
	private IDAOCompetence daoCompetence;
	
	
	public List<Formateur> getAll(){
		return daoFormateur.findAll();
	}
	
	public Formateur getById(Integer id) {
		return daoFormateur.findById(id).orElseThrow();
	}
	
	public Formateur insert(Formateur formateur) {
		return daoFormateur.save(formateur);
	}
	
	public Formateur update(Formateur formateur) {
		if(formateur.getId() == null) {
			throw new RuntimeException("l'id n'existe pas");
		}
		return daoFormateur.save(formateur);
	}
	
	public void deleteByID(Integer id) {
		
		VideoProjecteur proj = daoVideoProjecteur.findByFormateur(id);
		proj.setFormateur(null);
		daoVideoProjecteur.save(proj);
		
		Ordinateur ordinateur = daoOrdinateur.findByFormateur(id);
		ordinateur.setFormateur(null);
		daoOrdinateur.save(ordinateur);
		
		List<Bloc> blocs = daoBloc.findByFormateur(id);
		Formateur formateur= new Formateur();
		blocs = blocs.stream()
				.peek(bloc->bloc.setFormateur(null))
				.collect(Collectors.toList());
		
		blocs.stream().forEach(bloc->daoBloc.save(bloc));
		
		
		// Trouver le videoprojecteur associé au formateur => select v from VideoProjecteur v 
		// Modifier le video projecteur pour retirer le formateur
		// Supprimer le formateur
	}
	
	
}
