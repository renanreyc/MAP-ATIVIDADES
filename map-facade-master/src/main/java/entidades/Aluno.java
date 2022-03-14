package entidades;

public class Aluno {

    private String id;
    private RDM rdm;
    private Historico historico;

    public Aluno(String id, RDM rdm, Historico historico) {
        this.id = id;
        this.rdm = rdm;
        this.historico = historico;
    }

    public RDM getRdm() {
        return rdm;
    }

    public Historico getHistorico() {
        return historico;
    }
}
