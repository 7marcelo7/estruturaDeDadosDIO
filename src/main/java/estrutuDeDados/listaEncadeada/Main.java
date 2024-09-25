package estrutuDeDados.listaEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Exemplo1");
        minhaListaEncadeada.add("Exemplo2");
        minhaListaEncadeada.add("Exemplo3");
        minhaListaEncadeada.add("Exemplo4");
        minhaListaEncadeada.add("Exemplo5");
        minhaListaEncadeada.add("Exemplo6");
        minhaListaEncadeada.add("Exemplo7");


        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(5));
    }
}
