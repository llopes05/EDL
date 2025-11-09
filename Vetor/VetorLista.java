package Vetor;

public class VetorLista{
    private No head;
    private int size;
    private No tail;

    public class No{
        Object dado;
        No prox;
        No anter;
        public No(Object d){
            dado = d;
            prox = anter = null;
        }
    }

    public VetorLista(){
        head = new No (null); // sentinela
        tail = new No (null); // sentinela
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

    private No getNoAt(int r) {
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        No atual = head.prox; // para começar após o sentinela
        for (int i = 0; i < r; i++) {
            atual = atual.prox;
        }
        
        return atual;
    }
 
    public Object elemAtRank(int r){
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        No no = getNoAt(r);
        return no.dado;
    }

    public Object replaceAtRank(int r, Object o){
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        No no = getNoAt(r);
        Object removido = no.dado;
        no.dado = o;
        
        return removido;
    }

    public void insertAtRank(int r, Object o){
        if (r < 0 || r > size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        No novo = new No(o);
        
        if (r == size) { // caso r seja igual ao tamanho, insere no final. para não precisar ser O(n)
            No ultimoNo = tail.anter;
            
            novo.anter = ultimoNo;
            novo.prox = tail;
            ultimoNo.prox = novo;
            tail.anter = novo;
        } else {
            No atual = getNoAt(r);
            No noAnterior = atual.anter;
            novo.prox = atual;
            novo.anter = noAnterior;
            noAnterior.prox = novo;
            atual.anter = novo;
        }
        
        size++;
    }

    public Object removeAtRank(int r){
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        No no = getNoAt(r);
        Object removido = no.dado;
        No noAnterior = no.anter;
        No noProximo = no.prox;
        noAnterior.prox = noProximo;
        noProximo.anter = noAnterior;
        
        size--;
        
        return removido;
    }



}
