package Lista;

public class ListaArrayTeste {
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(5);
        
        // teste 1 - estado inicial
        System.out.println("teste 1 - estado inicial");
        System.out.println("vazio? " + lista.isEmpty());
        System.out.println("tamanho: " + lista.size());
        System.out.println("capacidade: " + lista.getCapacidade());
        
        // teste 2 - insertFirst e insertLast
        System.out.println("\nteste 2 - insertFirst e insertLast");
        lista.insertFirst(10);
        lista.insertLast(20);
        lista.insertLast(30);
        System.out.println("tamanho: " + lista.size());
        System.out.print("lista: ");
        lista.printArray();
        
        // teste 3 - first e last
        System.out.println("\nteste 3 - first e last");
        System.out.println("primeira posição: " + lista.first());
        System.out.println("última posição: " + lista.last());
        System.out.println("primeiro elemento: " + lista.getElement(lista.first()));
        System.out.println("último elemento: " + lista.getElement(lista.last()));
        
        // teste 4 - isFirst e isLast
        System.out.println("\nteste 4 - isFirst e isLast");
        System.out.println("posição 0 é primeira? " + lista.isFirst(0));
        System.out.println("posição 2 é última? " + lista.isLast(2));
        System.out.println("posição 1 é primeira? " + lista.isFirst(1));
        
        // teste 5 - before e after
        System.out.println("\nteste 5 - before e after");
        System.out.println("antes de posição 1: " + lista.before(1));
        System.out.println("depois de posição 1: " + lista.after(1));
        
        // teste 6 - insertBefore e insertAfter
        System.out.println("\nteste 6 - insertBefore e insertAfter");
        lista.insertBefore(1, 15);
        lista.insertAfter(2, 25);
        System.out.println("tamanho: " + lista.size());
        System.out.print("lista: ");
        lista.printArray();
        
        // teste 7 - getElement
        System.out.println("\nteste 7 - getElement");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("posição " + i + ": " + lista.getElement(i));
        }
        
        // teste 8 - replaceElement
        System.out.println("\nteste 8 - replaceElement");
        Object antigo = lista.replaceElement(2, 99);
        System.out.println("substituído: " + antigo);
        System.out.print("lista: ");
        lista.printArray();
        
        // teste 9 - swapElements
        System.out.println("\nteste 9 - swapElements");
        System.out.println("antes da troca - pos 0: " + lista.getElement(0) + ", pos 4: " + lista.getElement(4));
        lista.swapElements(0, 4);
        System.out.println("depois da troca - pos 0: " + lista.getElement(0) + ", pos 4: " + lista.getElement(4));
        System.out.print("lista: ");
        lista.printArray();
        
        // teste 10 - remove
        System.out.println("\nteste 10 - remove");
        Object removido = lista.remove(1);
        System.out.println("removido: " + removido);
        System.out.println("tamanho: " + lista.size());
        System.out.print("lista: ");
        lista.printArray();
        
        // teste 11 - redimensionamento
        System.out.println("\nteste 11 - redimensionamento");
        System.out.println("capacidade antes: " + lista.getCapacidade());
        lista.insertLast(40);
        lista.insertLast(50);
        lista.insertLast(60);
        System.out.println("capacidade depois: " + lista.getCapacidade());
        System.out.print("lista: ");
        lista.printArray();
        
        // teste 12 - exceções
        System.out.println("\nteste 12 - exceções");
        try {
            lista.before(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        try {
            lista.after(lista.last());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        try {
            lista.getElement(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        System.out.println("\ntestes concluídos");
    }
}
