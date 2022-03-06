package tests.builders;

import java.util.ArrayList;

import main.entities.Aluno;
import main.entities.Historico;
import main.entities.Matricula;

public class AlunoBuilder {
	
	private Aluno aluno;
	
	public static AlunoBuilder mockAluno() {
		AlunoBuilder builder = new AlunoBuilder();
		builder.aluno = new Aluno("Thiago", new ArrayList<Matricula>() , new ArrayList<Historico>());
		
		return builder;
	}
	
	public Aluno getAluno() {
		return this.aluno;
	}
}
