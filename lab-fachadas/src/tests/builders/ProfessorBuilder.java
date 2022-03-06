package tests.builders;

import main.entities.Professor;
import main.enums.Proficiencias;

public class ProfessorBuilder {
	private Professor professor;
	
	public static ProfessorBuilder mockProfessor() {
		ProfessorBuilder builder = new ProfessorBuilder();
		builder.professor = new Professor("Professor teste", Proficiencias.MATEMATICA, new Double(1246));
		
		return builder;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
}