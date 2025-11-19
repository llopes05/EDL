package Vetor;

public class TesteVetorLista {
    public static void main(String[] args) {
        VetorLista vetor = new VetorLista();
        
        // teste 1 - estado inicial
        System.out.println("teste 1 - estado inicial");
        System.out.println("vazio? " + vetor.isEmpty());
        System.out.println("tamanho: " + vetor.size());
        
        // teste 2 - inserção
        System.out.println("\nteste 2 - inserção");
        vetor.insertAtRank(0, 10);
        System.out.println("tamanho: " + vetor.size());
        vetor.insertAtRank(1, 2);
        System.out.println("tamanho: " + vetor.size());
        System.out.println("posição 0: " + vetor.elemAtRank(2));
        // vetor.insertAtRank(1, 20);
        // vetor.insertAtRank(2, 30);
        // vetor.insertAtRank(3, 40);
        // System.out.println("tamanho: " + vetor.size());
        // for (int i = 0; i < vetor.size(); i++) {
        //     System.out.println("posição " + i + ": " + vetor.elemAtRank(i));
        // }
        
        // // teste 3 - inserir no meio
        // System.out.println("\nteste 3 - inserir no meio");
        // vetor.insertAtRank(2, 25);
        // System.out.println("tamanho: " + vetor.size());
        // for (int i = 0; i < vetor.size(); i++) {
        //     System.out.println("posição " + i + ": " + vetor.elemAtRank(i));
        // }
        
        // // teste 4 - inserir no início
        // System.out.println("\nteste 4 - inserir no início");
        // vetor.insertAtRank(0, 5);
        // System.out.println("tamanho: " + vetor.size());
        // for (int i = 0; i < vetor.size(); i++) {
        //     System.out.println("posição " + i + ": " + vetor.elemAtRank(i));
        // }
        
        // // teste 5 - acessar elementos
        // System.out.println("\nteste 5 - acessar elementos");
        // System.out.println("posição 0: " + vetor.elemAtRank(0));
        // System.out.println("posição 3: " + vetor.elemAtRank(3));
        // System.out.println("posição 5: " + vetor.elemAtRank(5));
        
        // // teste 6 - substituir elemento
        // System.out.println("\nteste 6 - substituir elemento");
        // Object antigo = vetor.replaceAtRank(3, 99);
        // System.out.println("substituído: " + antigo);
        // System.out.println("novo na posição 3: " + vetor.elemAtRank(3));
        
        // // teste 7 - remover elementos
        // System.out.println("\nteste 7 - remover elementos");
        // Object removido1 = vetor.removeAtRank(0);
        // System.out.println("removido: " + removido1);
        // System.out.println("tamanho: " + vetor.size());
        
        // Object removido2 = vetor.removeAtRank(2);
        // System.out.println("removido: " + removido2);
        // System.out.println("tamanho: " + vetor.size());
        
        // for (int i = 0; i < vetor.size(); i++) {
        //     System.out.println("posição " + i + ": " + vetor.elemAtRank(i));
        // }
        
        // // teste 8 - inserir mais elementos
        // System.out.println("\nteste 8 - inserir mais elementos");
        // vetor.insertAtRank(vetor.size(), 50);
        // vetor.insertAtRank(vetor.size(), 60);
        // vetor.insertAtRank(vetor.size(), 70);
        // System.out.println("tamanho: " + vetor.size());
        // for (int i = 0; i < vetor.size(); i++) {
        //     System.out.println("posição " + i + ": " + vetor.elemAtRank(i));
        // }
        
        // // teste 9 - remover todos
        // System.out.println("\nteste 9 - remover todos");
        // while (!vetor.isEmpty()) {
        //     Object removido = vetor.removeAtRank(0);
        //     System.out.println("removido: " + removido + ", tamanho: " + vetor.size());
        // }
        // System.out.println("vazio? " + vetor.isEmpty());
        
        // // teste 10 - exceções
        // System.out.println("\nteste 10 - exceções");
        // try {
        //     vetor.elemAtRank(0);
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("exceção: " + e.getMessage());
        // }
        
        // vetor.insertAtRank(0, 100);
        // vetor.insertAtRank(1, 200);
        
        // try {
        //     vetor.elemAtRank(10);
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("exceção: " + e.getMessage());
        // }
        
        // try {
        //     vetor.removeAtRank(-1);
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("exceção: " + e.getMessage());
        // }
        
        System.out.println("\ntestes concluídos");
    }
}
