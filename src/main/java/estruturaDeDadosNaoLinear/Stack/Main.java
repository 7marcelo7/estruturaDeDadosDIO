package estruturaDeDadosNaoLinear.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> carroStack = new Stack<>();

        carroStack.push(new Carro("Koenigsegg"));
        carroStack.push(new Carro("Ferrari"));
        carroStack.push(new Carro("BMW"));
        carroStack.push(new Carro("Ford"));
        carroStack.push(new Carro("Mitsubishi"));

        System.out.println(carroStack);

        System.out.println(carroStack.pop());
        System.out.println(carroStack);

        System.out.println(carroStack.peek());
        System.out.println(carroStack);
    }
}
