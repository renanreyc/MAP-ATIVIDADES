package subsistemas;

import entidades.Reuniao;
import entidades.Entrevista;

import java.util.ArrayList;
import java.util.List;

public class Administrativo {

        public List<Reuniao> getAgendamentosComADiretoria() {
                ArrayList<Reuniao> reuniaos = new ArrayList();

                reuniaos.add(new Reuniao("01", "07:00"));
                reuniaos.add(new Reuniao("02", "08:00"));
                reuniaos.add(new Reuniao("03", "09:00"));
                reuniaos.add(new Reuniao("04", "10:00"));

                return reuniaos;
        }

        public List <Entrevista> getEntrevistas() {
                ArrayList<Entrevista> entrevistas = new ArrayList();

                entrevistas.add(new Entrevista("01", "11:00"));
                entrevistas.add(new Entrevista("02", "12:00"));
                entrevistas.add(new Entrevista("03", "13:00"));
                entrevistas.add(new Entrevista("04", "14:00"));

                return entrevistas;
        }
}
