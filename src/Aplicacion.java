
public class Aplicacion {

    public static void main(String[] args) {
        ListaOrdinal lista = new ListaOrdinal();
        Paciente p1 = new Paciente("Alberto","Frecuentes mareos");
        Paciente p2 = new Paciente("Ana","Infección resistente");
        Paciente p3 = new Paciente("Eva","Problemas digestivos");
        Paciente p4 = new Paciente("Ernesto","Problemas cardiovasculares");
        lista.insertar(p1);
        lista.insertar(p2);
        lista.insertar(p3);
        lista.insertar(p4);
        p2.darAlta();
        p3.darAlta();

        lista.borrarAltas();
        Iterador iterador = lista.obtenerIterador();
        while(iterador.hasNext()){
            iterador.next().verPaciente();
        }


    }}
