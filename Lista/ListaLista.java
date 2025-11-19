package Lista;

public class ListaLista {
    private No head;
    private int size;
    private No tail;

    public class No {
        Object dado;
        No prox;
        No anter;

        public No(Object d) {
            dado = d;
            prox = anter = null;
        }
    }

    public ListaLista() {
        head = new No(null); // sentinela
        tail = new No(null); // sentinela
        head.prox = tail;
        tail.anter = head;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFirst(No n) {
        if (n == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        return n.anter == head;
    }

    public boolean isLast(No n) {
        if (n == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        return n.prox == tail;
    }

    public No first() {
        if (isEmpty()) {
            throw new IllegalStateException("lista vazia");
        }
        return head.prox;
    }

    public No last() {
        if (isEmpty()) {
            throw new IllegalStateException("lista vazia");
        }
        return tail.anter;
    }

    public No before(No p) {
        if (p == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        if (p.anter == head) {
            throw new IllegalArgumentException("não há elemento antes");
        }
        return p.anter;
    }

    public No after(No p) {
        if (p == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        if (p.prox == tail) {
            throw new IllegalArgumentException("não há elemento depois");
        }
        return p.prox;
    }

    public Object replaceElement(No n, Object o) {
        if (n == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        Object removido = n.dado;
        n.dado = o;
        return removido;
    }

    public void swapElements(No n, No q) {
        if (n == null || q == null) {
            throw new IllegalArgumentException("nós inválidos");
        }
        Object temp = n.dado;
        n.dado = q.dado;
        q.dado = temp;
    }

    public No insertBefore(No p, Object o) {
        if (p == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        
        No newNode = new No(o);
        No anterNode = p.anter;
        
        newNode.prox = p;
        newNode.anter = anterNode;
        p.anter = newNode;
        anterNode.prox = newNode;
        
        size++;
        return newNode;
    }

    public No insertAfter(No p, Object o) {
        if (p == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        
        No newNode = new No(o);
        No proxNo = p.prox;
        
        newNode.anter = p;
        newNode.prox = proxNo;
        p.prox = newNode;
        proxNo.anter = newNode;
        
        size++;
        return newNode;
    }

    public No insertFirst(Object o) {
        No newNode = new No(o);
        No primeiroNo = head.prox;
        
        newNode.prox = primeiroNo;
        newNode.anter = head;
        head.prox = newNode;
        primeiroNo.anter = newNode;
        
        size++;
        return newNode;
    }

    public No insertLast(Object o) {
        No newNode = new No(o);
        No ultimoNo = tail.anter;
        
        newNode.anter = ultimoNo;
        newNode.prox = tail;
        ultimoNo.prox = newNode;
        tail.anter = newNode;
        
        size++;
        return newNode;
    }

    public Object remove(No n) {
        if (n == null) {
            throw new IllegalArgumentException("nó inválido");
        }
        if (n == head || n == tail) {
            throw new IllegalArgumentException("não pode remover sentinela");
        }
        
        Object removido = n.dado;
        No noAnterior = n.anter;
        No noProximo = n.prox;
        
        noAnterior.prox = noProximo;
        noProximo.anter = noAnterior;
        
        size--;
        return removido;
    }
}


