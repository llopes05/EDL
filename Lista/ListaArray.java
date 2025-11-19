package Lista;

public class ListaArray {
    private Object[] array;
    private int size;
    private int capacidade;

    public ListaArray(int capacidade) {
        this.capacidade = capacidade;
        this.array = new Object[capacidade];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFirst(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        return pos == 0;
    }

    public boolean isLast(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        return pos == size - 1;
    }

    public int first() {
        if (isEmpty()) {
            throw new IllegalStateException("lista vazia");
        }
        return 0;
    }

    public int last() {
        if (isEmpty()) {
            throw new IllegalStateException("lista vazia");
        }
        return size - 1;
    }

    public int before(int p) {
        if (p <= 0 || p >= size) {
            throw new IndexOutOfBoundsException("não há elemento antes");
        }
        return p - 1;
    }

    public int after(int p) {
        if (p < 0 || p >= size - 1) {
            throw new IndexOutOfBoundsException("não há elemento depois");
        }
        return p + 1;
    }

    public Object replaceElement(int pos, Object o) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        Object removido = array[pos];
        array[pos] = o;
        return removido;
    }

    public void swapElements(int pos1, int pos2) {
        if (pos1 < 0 || pos1 >= size || pos2 < 0 || pos2 >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        Object temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public void insertBefore(int p, Object o) {
        if (p < 0 || p >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        
        if (size == capacidade) {
            redimensionar(capacidade * 2);
        }
        
        for (int i = size; i > p; i--) {
            array[i] = array[i - 1];
        }
        
        array[p] = o;
        size++;
    }

    public void insertAfter(int p, Object o) {
        if (p < 0 || p >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        
        if (size == capacidade) {
            redimensionar(capacidade * 2);
        }
        
        for (int i = size; i > p + 1; i--) {
            array[i] = array[i - 1];
        }
        
        array[p + 1] = o;
        size++;
    }

    public void insertFirst(Object o) {
        if (size == capacidade) {
            redimensionar(capacidade * 2);
        }
        
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        
        array[0] = o;
        size++;
    }

    public void insertLast(Object o) {
        if (size == capacidade) {
            redimensionar(capacidade * 2);
        }
        
        array[size] = o;
        size++;
    }

    public Object remove(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        
        Object removido = array[pos];
        
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        
        array[size - 1] = null;
        size--;
        
        return removido;
    }

    private void redimensionar(int novaCapacidade) {
        Object[] novoArray = new Object[novaCapacidade];
        
        for (int i = 0; i < size; i++) {
            novoArray[i] = array[i];
        }
        
        array = novoArray;
        capacidade = novaCapacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public Object getElement(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("posição inválida");
        }
        return array[pos];
    }

    public void printArray() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}