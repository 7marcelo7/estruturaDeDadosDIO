package estruturaDeDadosNaoLinear.equalsHashCode;

import estrutuDeDados.listaCircular.ListaCircular;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("BMW"));
        listaCarros.add(new Carro("Ferrari"));
        listaCarros.add(new Carro("Koenigsegg"));
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Renault"));
        listaCarros.add(new Carro("Citroen"));
        listaCarros.add(new Carro("Porsche"));

        System.out.println(listaCarros.contains(new Carro("Koenigsegg")));
        System.out.println(new Carro("Koenigsegg").hashCode());

        Carro carro1 = new Carro("Ferrari");
        Carro carro2 = new Carro("Ferrari");

        System.out.println(carro1.equals(carro2));
    }
}
