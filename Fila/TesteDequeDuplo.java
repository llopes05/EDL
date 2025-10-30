package Fila;

public class TesteDequeDuplo {
    public static void main(String[] args) {
    DequeDuplo deque = new DequeDuplo();
    
    
    deque.inserirNaDireita(10);   // 10
    // deque.inserirNaEsquerda(5);   // 5, 10
    // deque.inserirNaDireita(20);   // 5, 10, 20
    
    // deque.imprimir();  
    
    // System.out.println(deque.removerNaEsquerda()); // 5
    // System.out.println(deque.removerNaDireita());  // 20
    deque.removerNaDireita();
    
    deque.imprimir();  
}
}
