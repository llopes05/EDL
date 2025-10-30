public class TestePilha {
    public static void main(String[] args) {
        
        
        PilhaRubroNegra pilha = new PilhaRubroNegra(5);
        
        try {

            System.out.println("\n==== Início ====");

            // teste do isEmpty e do size - 1° teste
            System.out.println("\niniciando primeiro teste:");
            System.out.println("capacidade inicial: " + pilha.getCapacidade());
            System.out.println("pilha vermelha está vazia? " + pilha.isEmptyVermelho());
            System.out.println("pilha preta está vazia? " + pilha.isEmptyPreto());
            System.out.println("tamanho da pilha vermelha: " + pilha.sizeVermelho());
            System.out.println("tamanho da pilha preta: " + pilha.sizePreto());
            
            // push vermelho - 2° teste
            System.out.println("\ncolocando 3 elementos na pilha preta");
            System.out.println("Inserindo 3 elementos na pilha vermelha");
            pilha.pushVermelho("Vermelho 1");
            pilha.pushVermelho("Vermelho 2");
            pilha.pushVermelho("Vermelho 3");
            System.out.println("tamanho da pilha vermelha: " + pilha.sizeVermelho());
            System.out.println("topo da pilha vermelha: " + pilha.topVermelho());
            
            // push preto - 3° teste
            System.out.println("\ncolocando 3 elementos na pilha preta...");
            pilha.pushPreto("Preto 1");
            pilha.pushPreto("Preto 2");
            pilha.pushPreto("Preto 3");
            System.out.println("tamanho da pilha preta: " + pilha.sizePreto());
            System.out.println("topo da pilha preta: " + pilha.topPreto());
            
            // redimensionamento - 4° teste
            System.out.println("\nredimensionamento das pilhas:");
            System.out.println("capacidade antes de inserir mais elementos: " + pilha.getCapacidade());
            // exedendo a capacidade da pilha
            for (int i = 4; i <= 10; i++) {
                pilha.pushVermelho("Vermelho " + i);
                pilha.pushPreto("Preto " + i);
            }
            System.out.println("capacidade após inserções: " + pilha.getCapacidade());
            System.out.println("tamanho da pilha vermelha: " + pilha.sizeVermelho());
            System.out.println("tamanho da pilha preta: " + pilha.sizePreto());
            
            // pop de elementos - 5° teste
            System.out.println("\npop de elementos");
            System.out.println("Removendo elementos da pilha vermelha...");
            System.out.println("Elemento removido: " + pilha.popVermelho());
            System.out.println("Elemento removido: " + pilha.popVermelho());
            System.out.println("Tamanho da pilha vermelha após remoções: " + pilha.sizeVermelho());
            
            System.out.println("Removendo elementos da pilha preta...");
            System.out.println("Elemento removido: " + pilha.popPreto());
            System.out.println("Elemento removido: " + pilha.popPreto());
            System.out.println("Tamanho da pilha preta após remoções: " + pilha.sizePreto());
            
            // verificação dos topos - 6° teste
            System.out.println("\nverificando topos:");
            System.out.println("topo atual da pilha vermelha: " + pilha.topVermelho());
            System.out.println("topo atual da pilha preta: " + pilha.topPreto());
            
            // esvaziamento das pilhas - 7° teste
            System.out.println("\nesvaziando pilhas:");
            
            // esvaziar pilha vermelha
            System.out.println("esvaziando pilha vermelha...");
            while (!pilha.isEmptyVermelho()) {
                System.out.println("removido: " + pilha.popVermelho());
                System.out.println("capacidade atual da pilha: " + pilha.getCapacidade());
            }
            System.out.println("pilha vermelha está vazia? " + pilha.isEmptyVermelho());
            
            // esvaziar pilha preta
            System.out.println("esvaziando pilha preta...");
            while (!pilha.isEmptyPreto()) {
                System.out.println("removido: " + pilha.popPreto());
                System.out.println("capacidade atual da pilha: " + pilha.getCapacidade());
            }
            System.out.println("pilha preta está vazia? " + pilha.isEmptyPreto());
            
            
        System.out.println("capacidade final da pilha: " + pilha.getCapacidade());
        
        System.out.println("\n==== Fim ====");
        } catch (Exception e) {
            System.out.println("Erro durante os testes: " + e.getMessage());
        }
    }
}