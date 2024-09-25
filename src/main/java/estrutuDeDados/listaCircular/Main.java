package estrutuDeDados.listaCircular;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");

        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        minhaListaCircular.add("c5");
        minhaListaCircular.add("c6");
        minhaListaCircular.add("c7");

        System.out.println(minhaListaCircular);

        for (int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
