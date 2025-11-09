package Lista;

public class ListaArray{
    private No head;
    private int size;
    pribate No tail;

    public class No{
        Object dado;
        No prox;
        No anter;
        public No(Object d){
            dado = d;
            prox = anter = null;
        }
    }

    public ListaArray(){
        head = new No(null);
        tail = new No(null);
        head.prox = tail;
        tail.anter = head;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

}