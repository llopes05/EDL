package Lista;

public class ListaListaTeste {
    public static void main(String[] args) {
        ListaLista lista = new ListaLista();
        
        // teste 1 - estado inicial
        System.out.println("teste 1 - estado inicial");
        System.out.println("vazio? " + lista.isEmpty());
        System.out.println("tamanho: " + lista.size());
        
        // teste 2 - insertFirst e insertLast
        System.out.println("\nteste 2 - insertFirst e insertLast");
        ListaLista.No no1 = lista.insertFirst(10);
        ListaLista.No no2 = lista.insertLast(20);
        ListaLista.No no3 = lista.insertLast(30);
        System.out.println("tamanho: " + lista.size());
        System.out.println("primeiro: " + lista.first().dado);
        System.out.println("último: " + lista.last().dado);
        
        // teste 3 - first e last
        System.out.println("\nteste 3 - first e last");
        System.out.println("primeiro elemento: " + lista.first().dado);
        System.out.println("último elemento: " + lista.last().dado);
        
        // teste 4 - isFirst e isLast
        System.out.println("\nteste 4 - isFirst e isLast");
        System.out.println("no1 é primeiro? " + lista.isFirst(no1));
        System.out.println("no3 é último? " + lista.isLast(no3));
        System.out.println("no2 é primeiro? " + lista.isFirst(no2));
        
        // teste 5 - before e after
        System.out.println("\nteste 5 - before e after");
        System.out.println("antes de no2: " + lista.before(no2).dado);
        System.out.println("depois de no2: " + lista.after(no2).dado);
        
        // teste 6 - insertBefore e insertAfter
        System.out.println("\nteste 6 - insertBefore e insertAfter");
        ListaLista.No no4 = lista.insertBefore(no2, 15);
        ListaLista.No no5 = lista.insertAfter(no2, 25);
        System.out.println("tamanho: " + lista.size());
        
        // teste 7 - percorrer lista
        System.out.println("\nteste 7 - percorrer lista");
        ListaLista.No atual = lista.first();
        System.out.print("elementos: ");
        while (atual != null) {
            System.out.print(atual.dado);
            if (!lista.isLast(atual)) {
                System.out.print(", ");
                atual = lista.after(atual);
            } else {
                break;
            }
        }
        System.out.println();
        
        // teste 8 - replaceElement
        System.out.println("\nteste 8 - replaceElement");
        Object antigo = lista.replaceElement(no2, 99);
        System.out.println("substituído: " + antigo);
        System.out.println("novo valor de no2: " + no2.dado);
        
        // teste 9 - swapElements
        System.out.println("\nteste 9 - swapElements");
        System.out.println("antes da troca - no1: " + no1.dado + ", no3: " + no3.dado);
        lista.swapElements(no1, no3);
        System.out.println("depois da troca - no1: " + no1.dado + ", no3: " + no3.dado);
        
        // teste 10 - remove
        System.out.println("\nteste 10 - remove");
        Object removido = lista.remove(no4);
        System.out.println("removido: " + removido);
        System.out.println("tamanho: " + lista.size());
        
        // teste 11 - percorrer após remoções
        System.out.println("\nteste 11 - percorrer após remoções");
        atual = lista.first();
        System.out.print("elementos: ");
        while (atual != null) {
            System.out.print(atual.dado);
            if (!lista.isLast(atual)) {
                System.out.print(", ");
                atual = lista.after(atual);
            } else {
                break;
            }
        }
        System.out.println();
        
        // teste 12 - exceções
        System.out.println("\nteste 12 - exceções");
        try {
            lista.before(lista.first());
        } catch (IllegalArgumentException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        try {
            lista.after(lista.last());
        } catch (IllegalArgumentException e) {
            System.out.println("exceção: " + e.getMessage());
        }
        
        System.out.println("\ntestes concluídos");
    }
}
