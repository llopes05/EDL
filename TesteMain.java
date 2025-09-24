public class TesteMain {
    public static void main(String[] args) {
        
        PilhaRubroNegra pilha = new PilhaRubroNegra(1000);
        
        
        try {
            System.out.println("Capacidade do array: " + pilha.getCapacidade()); 
            //adicionei essen egocio em cima
            System.out.println("=== TESTANDO PILHA VERMELHA ===");
            
            pilha.pushVermelho("Vermelho 1");
            pilha.pushVermelho("Vermelho 2");
            pilha.pushVermelho("Vermelho 3");
            
            System.out.println(pilha.sizeVermelho());
            
            
           
            System.out.println("=== TESTANDO PILHA PRETA ===");
            pilha.pushPreto("Preto 1");
            pilha.pushPreto("Preto 2");
            pilha.pushPreto("Preto 3");
           
            System.out.println(pilha.sizePreto());
            System.out.println("Capacidade do array: " + pilha.getCapacidade());
        } catch (PilhaVaziaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}