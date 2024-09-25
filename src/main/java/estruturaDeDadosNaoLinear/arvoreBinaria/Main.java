package estruturaDeDadosNaoLinear.arvoreBinaria;

import estruturaDeDadosNaoLinear.arvoreBinaria.model.Obj;

public class Main {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvare = new ArvoreBinaria<>();

        minhaArvare.inserir(new Obj(13));
        minhaArvare.inserir(new Obj(10));
        minhaArvare.inserir(new Obj(25));
        minhaArvare.inserir(new Obj(2));
        minhaArvare.inserir(new Obj(12));
        minhaArvare.inserir(new Obj(20));
        minhaArvare.inserir(new Obj(31));
        minhaArvare.inserir(new Obj(29));

        minhaArvare.exibirInOrder();
        minhaArvare.exibirPreOrder();
        minhaArvare.exibirPosOrder();
    }
}
