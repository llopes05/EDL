package Sequencia;

public class SequenciaLista{
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

    public SequenciaLista(){
        head = new No (null); // sentinela
        tail = new No (null); // sentinela
        head.prox = tail;
        tail.anter = head;
        size = 0;
    }

    public No atRank(int r){
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
}
        
        No atual = head.prox;
    
        for ( int i=0 ; i<r; i++){
            atual = atual.prox;
        }



        return atual;
    }

    public Object elemAtRank(int r){
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        No no = atRank(r);
        return no.dado;
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
            No atual = atRank(r);
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
        
        No no = atRank(r);
        Object removido = no.dado;
        No noAnterior = no.anter;
        No noProximo = no.prox;
        noAnterior.prox = noProximo;
        noProximo.anter = noAnterior;
        
        size--;
        
        return removido;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public Object first(){
        if (isEmpty()) {
            return null;
        }
        return head.prox.dado;
    }
    public Object last(){
        if (isEmpty()) {
            return null;}
        return tail.anter.dado;}
    
    public Object before(No no){
        if (no.anter == head) {
            throw new IllegalArgumentException("não há elemento antes");
        }
        return no.anter.dado;
    }

    public Object after(No no){
        if (no.prox == tail) {
            throw new IllegalArgumentException("não há elemento depois");
        }
        return no.prox.dado;
    }

    public Object replaceAtRank(int r, Object o){
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        No no = atRank(r);
        Object removido = no.dado;
        no.dado = o;
        
        return removido;
    }

    public void swapElements(No n, No q){
        if (n == null || q == null) {
            throw new IllegalArgumentException("nós inválidos");
        }
        Object temp = n.dado;
        n.dado = q.dado;
        q.dado = temp;
    }

    public void insertBefore(No no, Object o){
        if (no == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        
        No novo = new No(o);
        No noAnterior = no.anter;
        novo.prox = no;
        novo.anter = noAnterior;
        noAnterior.prox = novo;
        no.anter = novo;
        
        size++;
    }

    public void insertAfter(No no, Object o){
        if (no == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        
        No novo = new No(o);
        No noProximo = no.prox;
        novo.anter = no;
        novo.prox = noProximo;
        no.prox = novo;
        noProximo.anter = novo;
        
        size++;
    }

    public void insertFirst(Object o){
        insertAtRank(0, o);
    }

    public void insertLast(Object o){
        insertAtRank(size, o);
    }

    public Object remove(No no){
        if (no == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        
        Object removido = no.dado;
        No noAnterior = no.anter;
        No noProximo = no.prox;
        noAnterior.prox = noProximo;
        noProximo.anter = noAnterior;
        
        size--;
        
        return removido;
    }
    public int rankOf(No no){
        if (no == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        
        No atual = head.prox;
        int rank = 0;
        
        while (atual != tail) {
            if (atual == no) {
                return rank;
            }
            atual = atual.prox;
            rank++;
        }
        
        throw new IllegalArgumentException("nó não pertence à lista");
    }



    



}