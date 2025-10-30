package Fila;

public class DequeSimples {
    private No head;
    private No tail;
    private int size;

    public class No {
        Object dado;
        No prox;

        public No(Object d) {
            dado = d;
            prox = null;
        }
    }

    public DequeSimples() {
        head = null;
        tail = null;
        size = 0;
    }

    // inserir na direita - O(1)
    public void inserirNaDireita(Object o) {
        No novo = new No(o);
        
        if (isEmpty()) {
            head = novo;
            tail = novo;
        } else {
            tail.prox = novo;
            tail = novo;
        }
        size++;
    }

    // inserir na esquerda - O(1)
    public void inserirNaEsquerda(Object o) {
        No novo = new No(o);
        
        if (isEmpty()) {
            head = novo;
            tail = novo;
        } else {
            novo.prox = head;
            head = novo;
        }
        size++;
    }

    // remover da esquerda - O(1)
    public Object removerNaEsquerda() {
        if (isEmpty()) {
            return null;
        }
        
        Object r = head.dado;
        head = head.prox;
        
        if (head == null) { // Se ficou vazia
            tail = null;
        }
        
        size--;
        return r;
    }

    // remover do final (direita) - O(n)
    public Object removerNaDireita() {
        if (isEmpty()) {
            return null;
        }
        
        if (head == tail) { // Só tem um elemento
            Object r = head.dado;
            head = tail = null;
            size--;
            return r;
        }
        
        // encontrando o penúltimo elemento - O(n)
        No atual = head;
        while (atual.prox != tail) {
            atual = atual.prox;
        }
        
        Object r = tail.dado;
        tail = atual;
        tail.prox = null;
        size--;
        return r;
    }

    // tamanho da fila - O(1)
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Object primeiro() {
        if (isEmpty()) return null;
        return head.dado;
    }

    public Object ultimo() {
        if (isEmpty()) return null;
        return tail.dado; 
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("Deque vazio!");
            return;
        }
        
        System.out.print("Deque: ");
        No atual = head;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}