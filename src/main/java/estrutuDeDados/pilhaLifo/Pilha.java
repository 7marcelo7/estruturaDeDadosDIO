package estrutuDeDados.pilhaLifo;

public class Pilha {

    private No refNOEntradaPilha;

    public Pilha() {
        this.refNOEntradaPilha = null;
    }

    public void push(No novoNO){
        No refAuxiliar = refNOEntradaPilha;
        refNOEntradaPilha = novoNO;
        refNOEntradaPilha.setReNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped =refNOEntradaPilha;
            refNOEntradaPilha = refNOEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNOEntradaPilha;
    }

    public boolean isEmpty() {
        if(refNOEntradaPilha == null){
            return true;
        }
        return false;

        //Outra forma de se fazer seria
        /*
         return refNOEntradaPilha == null ? true : false;
         */
    }

    @java.lang.Override
    public java.lang.String toString(){

        java.lang.String stringRetorno = "---------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNOEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            } else {
                break;
            }
        }
        stringRetorno += "==================\n";
        return stringRetorno;
    }
}
