package Fila;

public class DequeDuplo{
    private No head;
    private No tail;
    private int size;

    public class No{
        Object dado;
        No prox;
        No anter;

        public No(Object d){
            dado = d;
            prox = anter = null;
        }
    }

    public DequeDuplo(){
        head = new No (null); // sentinelas
        tail = new No (null); // sentinelas
        head.prox = tail;
        tail.anter = head;
        size = 0;
    }
    
    // inserir na direita - O(1)
    public void inserirNaDireita(Object o){
        No novo = new No(o);

        No ultimo = tail.anter; 

        novo.prox = tail;
        novo.anter = ultimo;
        ultimo.prox = novo;
        tail.anter = novo;

        size++;
    }
    
    // inserir na esquerda - O(1)
    public void inserirNaEsquerda(Object o){
        No novo = new No(o);

        No primeiro = head.prox;

        novo.prox = primeiro;
        novo.anter = head;
        head.prox = novo;
        primeiro.anter = novo;

        size++;
    }

    // remover da esquerda - O(1)
    public Object removerNaEsquerda(){
        if (isEmpty()) {  
            return null; 
        }
        
        No primeiro = head.prox;
        Object r = primeiro.dado;
        No novoprimeiro = primeiro.prox;

        head.prox = novoprimeiro;
        novoprimeiro.anter = head;
        size--;
        return r;
    }

    // remover da direita - O(1)
    public Object removerNaDireita(){
        if (isEmpty()) {
        return null; 
        }
        
        No ultimo = tail.anter;
        Object r = ultimo.dado;
        No novoultimo = ultimo.anter;

        tail.anter = novoultimo;
        novoultimo.prox = tail;
        size--;
        return r;
    }

    // tamanho da fila - O(1)
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head.prox == tail;
    }

    public void imprimir(){
        if (isEmpty()){
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Fila Dupla: ");
        No atual = head.prox;
        while (atual != tail){
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
    
    
    public Object primeiro() {
        if (isEmpty()) return null;
        return head.prox.dado;
    }
    
    public Object ultimo() {
        if (isEmpty()) return null;
        return tail.anter.dado;
    }
}