package Fila;



public class TesteDequeSimples {
    public static void main(String[] args) {
    DequeSimples deque = new DequeSimples();
    
    
    deque.inserirNaDireita(10);   // [10]
    deque.inserirNaEsquerda(5);   // [5, 10]
    deque.inserirNaDireita(20);   // [5, 10, 20]
    
    deque.imprimir();  
    
    System.out.println("Removendo da esquerda: " + deque.removerNaEsquerda()); // 5
    System.out.println("Removendo da direita: " + deque.removerNaDireita());  // 20
    
    deque.imprimir();  
}
}