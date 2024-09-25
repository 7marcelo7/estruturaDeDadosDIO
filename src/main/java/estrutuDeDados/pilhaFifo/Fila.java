package estrutuDeDados.pilhaFifo;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    //Adiciona um elemento ao inicio da fila
    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    //Remove um elemento do inicio da fila
    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No auxiliarNo = refNoEntradaFila;

            while (true){
                if(primeiroNo.getRefNo() != null){
                    auxiliarNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    auxiliarNo.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @java.lang.Override
    public java.lang.String toString() {
        java.lang.String stringRetorno = "";
        No auxiliarNo = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ auxiliarNo.getObject() +"}]--->";
                if(auxiliarNo.getRefNo() != null){
                    auxiliarNo = auxiliarNo.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
