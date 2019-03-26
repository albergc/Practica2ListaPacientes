
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
        p1.darAlta();
        p4.darAlta();
        verAltas(lista);
        Iterador iterador = pacienteSintoma(lista,"mas").obtenerIterador();

        while(iterador.hasNext()){
            iterador.next().verPaciente();
        }


    }
    public static  ListaOrdinal pacienteSintoma(ListaOrdinal lista, String sintoma){
        ListaOrdinal l1 = new ListaOrdinal();
        for (int i = 0; i < lista.tamaño(); i++) {
            if(lista.get(i).getSintomas().indexOf(sintoma)>-1){
                l1.insertar(lista.get(i));
            }
        }
        return l1;
    }


    public static void verAltas(ListaOrdinal lista){
        int aux= lista.tamaño();
        for (int i = 0; i < aux; i++) {
            if(lista.get(i).estaAlta()){lista.get(i).verPaciente();}
        }

    }
}
