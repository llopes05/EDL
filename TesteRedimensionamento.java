public class TesteRedimensionamento {
    public static void main(String[] args) {
        // Criando uma instância com capacidade grande para forçar redimensionamento
        System.out.println("Criando pilha com capacidade 30");
        PilhaRubroNegra pilha = new PilhaRubroNegra(30);
        System.out.println("Capacidade inicial: " + pilha.getCapacidade());
        
        try {
            // Inserindo apenas dois elementos
            System.out.println("\nInserindo elemento na pilha vermelha...");
            pilha.pushVermelho("Vermelho 1");
            
            System.out.println("Inserindo elemento na pilha preta...");
            pilha.pushPreto("Preto 1");
            
            // Verificando tamanhos
            System.out.println("\nTamanho da pilha vermelha: " + pilha.sizeVermelho());
            System.out.println("Tamanho da pilha preta: " + pilha.sizePreto());
            System.out.println("Total de elementos: " + (pilha.sizeVermelho() + pilha.sizePreto()));
            System.out.println("Capacidade: " + pilha.getCapacidade());
            
            // Verificando condição de redimensionamento
            System.out.println("\nUm terço da capacidade: " + (pilha.getCapacidade() / 3));
            
            // Forçando a verificação de tamanho
            System.out.println("\nForçando verificação de tamanho...");
            pilha.verificaTamanhoPilha();
            
            // Verificando se houve redimensionamento
            System.out.println("\nCapacidade após verificação: " + pilha.getCapacidade());
            
        } catch (PilhaVaziaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
