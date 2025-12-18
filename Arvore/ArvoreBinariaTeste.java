package Arvore;

public class ArvoreBinariaTeste {
    
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        // teste 1 - estado inicial
        System.out.println("teste 1 - estado inicial");
        System.out.println("árvore vazia:");
        arvore.desenharEstrutura();
        arvore.listarEmOrdem();
        
        // teste 2 - inserção de elementos
        System.out.println("\nteste 2 - inserção de elementos");
        arvore.adicionar(10);
        arvore.adicionar(5);
        arvore.adicionar(15);
        arvore.adicionar(2);
        arvore.adicionar(8);
        arvore.adicionar(22);
        System.out.println("após inserir 10, 5, 15, 2, 8, 22:");
        arvore.desenharEstrutura();
        arvore.listarEmOrdem();
        
        // teste 3 - busca de elementos
        System.out.println("\nteste 3 - busca de elementos");
        System.out.println("contém 5? " + arvore.contem(5));
        System.out.println("contém 15? " + arvore.contem(15));
        System.out.println("contém 100? " + arvore.contem(100));
        System.out.println("contém 2? " + arvore.contem(2));
        
        // teste 4 - adicionar mais elemento
        System.out.println("\nteste 4 - adicionar mais elemento");
        arvore.adicionar(26);
        System.out.println("após inserir 26:");
        arvore.desenharEstrutura();
        arvore.listarEmOrdem();
        
        // teste 5 - excluir nó folha
        System.out.println("\nteste 5 - excluir nó folha");
        arvore.excluir(2);
        System.out.println("após excluir 2:");
        arvore.desenharEstrutura();
        
        // teste 6 - excluir nó com um filho
        System.out.println("\nteste 6 - excluir nó com um filho");
        arvore.excluir(22);
        System.out.println("após excluir 22:");
        arvore.desenharEstrutura();
        
        // teste 7 - excluir nó com dois filhos
        System.out.println("\nteste 7 - excluir nó com dois filhos");
        arvore.excluir(5);
        System.out.println("após excluir 5:");
        arvore.desenharEstrutura();
        
        // teste 8 - excluir raiz
        System.out.println("\nteste 8 - excluir raiz");
        arvore.excluir(10);
        System.out.println("após excluir 10:");
        arvore.desenharEstrutura();
        arvore.listarEmOrdem();
        
        // teste 9 - elemento duplicado
        System.out.println("\nteste 9 - elemento duplicado");
        arvore.adicionar(15);
        System.out.println("após tentar inserir 15 (duplicado):");
        arvore.desenharEstrutura();
        
        System.out.println("\n==== Testes concluídos ====");
    }
}
