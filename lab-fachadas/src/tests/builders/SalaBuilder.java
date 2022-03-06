package tests.builders;

import main.entities.Sala;

public class SalaBuilder {

	private Sala sala;
	
	public static SalaBuilder mockSala() {
		SalaBuilder builder = new SalaBuilder();
		builder.sala = new Sala("c202");
		builder.sala.setDisciplina(DisciplinaBuilder.mockDisciplina().getDisciplina());
		builder.sala.setProfessor(builders.ProfessorBuilder.mockProfessor().getProfessor());
		
		return builder;
	}
	
	public Sala getSala() {
		return this.sala;
	}
}
