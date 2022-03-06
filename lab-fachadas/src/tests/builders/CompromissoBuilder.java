package tests.builders;

import java.util.Date;

import main.entities.Compromisso;
import main.enums.Compromissos;
import main.enums.Setores;

public class CompromissoBuilder {
	
	private Compromisso compromisso;
	
	public static CompromissoBuilder mockCompromisso() {
		CompromissoBuilder builder = new CompromissoBuilder();
		builder.compromisso =  new Compromisso(new Date(), Compromissos.ENTREVISTA, Setores.Diretoria);
		
		return builder;
	}
	
	public Compromisso getCompromisso() {
		return this.compromisso;
	}
}
