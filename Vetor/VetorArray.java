package Vetor;

public class VetorArray {
    private Object[] array;
    private int size;
    private int capacidade;

    
    public VetorArray(int capacidade) {
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

    public Object elemAtRank(int r) {
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        return array[r];
    }

    public Object replaceAtRank(int r, Object o) {
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        Object removido = array[r];
        array[r] = o;
        
        return removido;
    }

    public void insertAtRank(int r, Object o) {
        if (r < 0 || r > size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        if (size == capacidade) {
            redimensionar(capacidade * 2);
        }
        
        for (int i = size; i > r; i--) {
            array[i] = array[i - 1];
        }
        
        array[r] = o;
        size++;
    }

    
    public Object removeAtRank(int r) {
        if (r < 0 || r >= size) {
            throw new IndexOutOfBoundsException("rank inválido");
        }
        
        Object removido = array[r];
        
        for (int i = r; i < size - 1; i++) {
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

    public void getArray() {
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