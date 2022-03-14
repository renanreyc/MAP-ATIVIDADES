public class Main {
    public static void main(String[] args) {
        SIG sig = new SIG();

        // Administrativo
        sig.getReunioesAgendadasComADiretoria();
        sig.getEntrevistas();

        // Financeiro
        sig.getBalancoDeContas();
        sig.getFolhaDePagamento();

        // Alunos
        sig.getHistoricoDoAluno("01");
        sig.getRdmDoAluno("01");

        // Infraestrutura
        sig.getAlocacoesDeSalas();

        //professores
        sig.getProfessoresPorDisciplina("Matematica");
        sig.getProfessoresPorTempo("1 Ano");

        //almoxarifado
        sig.getEstoque();
        sig.getpedidos();


    }
}
