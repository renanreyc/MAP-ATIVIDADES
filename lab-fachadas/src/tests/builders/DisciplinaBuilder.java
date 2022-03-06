package tests.builders;

import java.util.ArrayList;
import java.util.Collection;

import main.entities.Disciplina;
import main.enums.Proficiencias;

public class DisciplinaBuilder {

	private Disciplina disciplina;
	private Collection<Disciplina> disciplinas;
	
	public static DisciplinaBuilder mockDisciplina() {
		DisciplinaBuilder builder = new DisciplinaBuilder();
		builder.disciplina = new Disciplina("Disciplina", Proficiencias.MATEMATICA);
		
		return builder;
	}
	
	public static DisciplinaBuilder mockCollectionDisciplinas() {
		DisciplinaBuilder builder = new DisciplinaBuilder();
		builder.disciplinas = new ArrayList<Disciplina>();
		
		for(int i=0; i<10; i++) {
			Disciplina disciplina = new Disciplina("Disciplina " + i, Proficiencias.MATEMATICA);
			
			builder.disciplinas.add(disciplina);
		}
		
		return builder;
	}
	
	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	
	public Collection<Disciplina> getDisciplinas(){
		return this.disciplinas;
	}
}
