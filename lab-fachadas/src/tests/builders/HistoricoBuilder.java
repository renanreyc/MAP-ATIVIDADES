package tests.builders;

import main.entities.Disciplina;
import main.entities.Historico;
import main.entities.Professor;
import main.entities.Sala;

public class HistoricoBuilder {

	private Historico historico;
	
	public HistoricoBuilder mockHistoricoBuilder() {
		HistoricoBuilder builder = new HistoricoBuilder();
		Disciplina disciplina = DisciplinaBuilder.mockDisciplina().getDisciplina();
		Sala sala = SalaBuilder.mockSala().getSala();
		Professor professor = builders.ProfessorBuilder.mockProfessor().getProfessor();
		
		builder.historico = new Historico(disciplina.getNome(), sala.getCodigo(), new Double(7.5), professor.getNome());
		
		return builder;
	}
	
	public Historico getHistorico() {
		return this.historico;
	}
}
