public class TesteMain {
    public static void main(String[] args) {
        
        PilhaRubroNegra pilha = new PilhaRubroNegra(1000);
        
        
        try {
            System.out.println("=== TESTANDO PILHA VERMELHA ===");
            pilha.pushVermelho("Vermelho 1");
            
            System.out.println(pilha.sizeVermelho());
            
           
            System.out.println("=== TESTANDO PILHA PRETA ===");
            pilha.pushPreto("Preto 1");
           
            System.out.println(pilha.sizePreto());
            System.out.println("Capacidade do array: " + pilha.getCapacidade());
        } catch (PilhaVaziaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}