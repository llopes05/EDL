package Sequencia;

public class SequenciaTeste {
    public static void main(String[] args) {
        SequenciaLista seq = new SequenciaLista();
        
        // teste 1 - estado inicial
        System.out.println("teste 1 - estado inicial");
        System.out.println("vazio? " + seq.isEmpty());
        System.out.println("tamanho: " + seq.size());
        
        // teste 2 - insertAtRank
        System.out.println("\nteste 2 - insertAtRank");
        seq.insertAtRank(0, 10);
        seq.insertAtRank(1, 20);
        seq.insertAtRank(2, 30);
        seq.insertAtRank(3, 40);
        System.out.println("tamanho: " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println("posição " + i + ": " + seq.elemAtRank(i));
        }
        
        // teste 3 - first e last
        System.out.println("\nteste 3 - first e last");
        System.out.println("primeiro: " + seq.first());
        System.out.println("último: " + seq.last());
        
        // teste 4 - atRank
        System.out.println("\nteste 4 - atRank");
        SequenciaLista.No no1 = seq.atRank(1);
        SequenciaLista.No no2 = seq.atRank(2);
        System.out.println("nó na posição 1: " + no1.dado);
        System.out.println("nó na posição 2: " + no2.dado);
        
        // teste 5 - before e after
        System.out.println("\nteste 5 - before e after");
        System.out.println("antes do nó posição 2: " + seq.before(no2));
        System.out.println("depois do nó posição 2: " + seq.after(no2));
        
        // teste 6 - insertBefore e insertAfter
        System.out.println("\nteste 6 - insertBefore e insertAfter");
        seq.insertBefore(no2, 25);
        seq.insertAfter(no2, 35);
        System.out.println("tamanho: " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println("posição " + i + ": " + seq.elemAtRank(i));
        }
        
        // teste 7 - replaceAtRank
        System.out.println("\nteste 7 - replaceAtRank");
        Object antigo = seq.replaceAtRank(2, 99);
        System.out.println("substituído: " + antigo);
        System.out.println("novo valor na posição 2: " + seq.elemAtRank(2));
        
        // teste 8 - swapElements
        System.out.println("\nteste 8 - swapElements");
        SequenciaLista.No no3 = seq.atRank(0);
        SequenciaLista.No no4 = seq.atRank(5);
        System.out.println("antes da troca - pos 0: " + no3.dado + ", pos 5: " + no4.dado);
        seq.swapElements(no3, no4);
        System.out.println("depois da troca - pos 0: " + no3.dado + ", pos 5: " + no4.dado);
        
        // teste 9 - insertFirst e insertLast
        System.out.println("\nteste 9 - insertFirst e insertLast");
        seq.insertFirst(5);
        seq.insertLast(100);
        System.out.println("tamanho: " + seq.size());
        System.out.println("primeiro: " + seq.first());
        System.out.println("último: " + seq.last());
        
        // teste 10 - remove
        System.out.println("\nteste 10 - remove");
        SequenciaLista.No noRemover = seq.atRank(3);
        Object removido = seq.remove(noRemover);
        System.out.println("removido: " + removido);
        System.out.println("tamanho: " + seq.size());
        
        // teste 11 - removeAtRank
        System.out.println("\nteste 11 - removeAtRank");
        Object removido2 = seq.removeAtRank(1);
        System.out.println("removido: " + removido2);
        System.out.println("tamanho: " + seq.size());
        
        // teste 12 - percorrer após operações
        System.out.println("\nteste 12 - percorrer após operações");
        for (int i = 0; i < seq.size(); i++) {
            System.out.println("posição " + i + ": " + seq.elemAtRank(i));
        }
        
        // teste 13 - exceções
        System.out.println("\nteste 13 - exceções");
        try {
            seq.elemAtRank(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        try {
            seq.before(seq.atRank(0));
        } catch (IllegalArgumentException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        try {
            seq.after(seq.atRank(seq.size() - 1));
        } catch (IllegalArgumentException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        System.out.println("\ntestes concluídos");
    }
}
