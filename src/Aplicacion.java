
public class Aplicacion {

    public static void main(String[] args) {
        ListaOrdinal Pacientes = new ListaOrdinal();
        Paciente p1 = new Paciente("Alberto","Frecuentes mareos");
        Paciente p2 = new Paciente("Ana","Infección resistente");
        Paciente p3 = new Paciente("Eva","Problemas digestivos");
        Paciente p4 = new Paciente("Ernesto","Problemas cardiovasculares");
        Pacientes.insertar(p1);
        Pacientes.insertar(p2);
        Pacientes.insertar(p3);
        Pacientes.insertar(p4);
        p2.darAlta();
        p3.darAlta();
        Iterador iterador = Pacientes.obtenerIterador();
        while(iterador.hasNext()){
            iterador.next().verPaciente();
        }
    }
}