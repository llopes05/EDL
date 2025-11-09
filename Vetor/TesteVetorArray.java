package Vetor;

public class TesteVetorArray {
    public static void main(String[] args) {
        VetorArray vetor = new VetorArray(5);
        
        // teste 1 - inserção
        System.out.println("teste 1 - inserção");
        vetor.insertAtRank(0, 10);
        vetor.insertAtRank(1, 20);
        vetor.insertAtRank(2, 30);
        vetor.insertAtRank(3, 40);
        System.out.print("vetor: ");
        vetor.getArray();
        System.out.println("tamanho: " + vetor.size());
        System.out.println("capacidade: " + vetor.getCapacidade());
        
        // teste 2 - inserir no meio
        System.out.println("\nteste 2 - inserir no meio");
        vetor.insertAtRank(2, 25);
        System.out.print("vetor: ");
        vetor.getArray();
        System.out.println("tamanho: " + vetor.size());
        
        // teste 3 - inserir no início
        System.out.println("\nteste 3 - inserir no início");
        vetor.insertAtRank(0, 5);
        System.out.print("vetor: ");
        vetor.getArray();
        System.out.println("tamanho: " + vetor.size());
        System.out.println("capacidade: " + vetor.getCapacidade());
        
        // teste 4 - acessar elementos
        System.out.println("\nteste 4 - acessar elementos");
        System.out.println("posição 0: " + vetor.elemAtRank(0));
        System.out.println("posição 2: " + vetor.elemAtRank(2));
        System.out.println("posição 4: " + vetor.elemAtRank(4));
        
        // teste 5 - substituir elemento
        System.out.println("\nteste 5 - substituir elemento");
        Object antigo = vetor.replaceAtRank(3, 99);
        System.out.println("substituído: " + antigo);
        System.out.print("vetor: ");
        vetor.getArray();
        
        // teste 6 - remover elementos
        System.out.println("\nteste 6 - remover elementos");
        Object removido1 = vetor.removeAtRank(0);
        System.out.println("removido: " + removido1);
        System.out.print("vetor: ");
        vetor.getArray();
        
        Object removido2 = vetor.removeAtRank(2);
        System.out.println("removido: " + removido2);
        System.out.print("vetor: ");
        vetor.getArray();
        System.out.println("tamanho: " + vetor.size());
        
        // teste 7 - redimensionamento
         System.out.println("capacidade: " + vetor.getCapacidade());
        System.out.println("\nteste 7 - redimensionamento");
        vetor.insertAtRank(vetor.size(), 50);
        vetor.insertAtRank(vetor.size(), 60);
        vetor.insertAtRank(vetor.size(), 70);
        vetor.insertAtRank(vetor.size(), 80);
        System.out.print("vetor: ");
        vetor.getArray();
        System.out.println("tamanho: " + vetor.size());
        System.out.println("capacidade: " + vetor.getCapacidade());
        
        // teste 8 - remover vários
        System.out.println("\nteste 8 - remover vários");
        for (int i = 0; i < 5; i++) {
            vetor.removeAtRank(0);
        }
        System.out.print("vetor: ");
        vetor.getArray();
        System.out.println("tamanho: " + vetor.size());
        System.out.println("capacidade: " + vetor.getCapacidade());
        
        // teste 9 - verificar vazio
        System.out.println("\nteste 9 - verificar vazio");
        System.out.println("vazio? " + vetor.isEmpty());
        while (!vetor.isEmpty()) {
            vetor.removeAtRank(0);
        }
        System.out.println("vazio? " + vetor.isEmpty());
        
        // teste 10 - exceções
        System.out.println("\nteste 10 - exceções");
        try {
            vetor.elemAtRank(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        try {
            vetor.removeAtRank(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        System.out.println("\ntestes concluídos");
    }
}
