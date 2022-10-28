import java.util.Date;

public class Program {
    public class Profissional {
        private String name;
        private String especiality;
        private String room;

        public Profissional(String name, String especiality, String room) {
            this.name = name;
            this.especiality = especiality;
            this.room = room;
        }

    }
    public class Visitante {
        private String name;
        private String identification;

        public Visitante(String name, String identification) {
            this.name = name;
            this.identification = identification;
        }
    }
    public class Visita {
        private Profissional professional;
        private Visitante visitante;
        private Date data;

        public Visita(Profissional professional,Visitante visitante, Date data) {
            this.professional = professional;
            this.visitante = visitante;
            this.data = data;
        }
        public void set

    }
}
