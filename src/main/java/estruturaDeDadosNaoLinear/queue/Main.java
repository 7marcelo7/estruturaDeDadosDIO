package estruturaDeDadosNaoLinear.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("BMW"));
        queueCarros.add(new Carro("Ferrari"));
        queueCarros.add(new Carro("Koenigsegg"));
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Renault"));
        queueCarros.add(new Carro("Citroen"));
        queueCarros.add(new Carro("Porsche"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Fiat")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());
    }
}
