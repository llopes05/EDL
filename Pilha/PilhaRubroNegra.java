public class PilhaRubroNegra extends PilhaArray {
    private int tPreto; 
    
    public PilhaRubroNegra(int capacidade) {
        super(capacidade);
        tPreto = capacidade; 
        
    }

    //
    // PILHA VERMELHA
    //
    
    public void pushVermelho(Object o) {
        if (t + 1 >= tPreto) {
            duplicaTamanho();
        }
        a[++t] = o;
    }

    public boolean isEmptyVermelho() {
        return t == -1;
    }

    public int sizeVermelho() {
        return t + 1;
    }
    
    public Object popVermelho() throws PilhaVaziaExcecao {
        if (isEmptyVermelho())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        Object r = a[t];
        a[t] = null;
        t--;
        reduzTamanho();
        return r;
    }

    public Object topVermelho() throws PilhaVaziaExcecao {
        if (isEmptyVermelho())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        return a[t];
    }

    //
    // PILHA PRETA
    //

    public void pushPreto(Object o) {
        if (tPreto - 1 <= t) {
            duplicaTamanho();
        }
        a[--tPreto] = o;
    }

    public boolean isEmptyPreto() {
        return capacidade == tPreto;
    }

    public int sizePreto() {
        return capacidade - tPreto;
    }

    public Object popPreto() throws PilhaVaziaExcecao {
        if (isEmptyPreto())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        

        Object rPreto = a[tPreto];
        a[tPreto] = null;
        tPreto++;
        reduzTamanho();
        return rPreto;
    }

    public Object topPreto() throws PilhaVaziaExcecao {
        if (isEmptyPreto())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        return a[tPreto];
    }
    

   
    protected void reduzTamanho(){
        int tamV = sizeVermelho();
        int tamP = sizePreto();
        int tamanhoTotal = tamV + tamP;
        if (tamanhoTotal < capacidade / 3) {
            redimensionarPilha(capacidade / 2, tamV, tamP);
         }

    }

    protected void  duplicaTamanho(){
        int tamV = sizeVermelho();
        int tamP = sizePreto();
        redimensionarPilha(capacidade * 2, tamV, tamP);
        }

    
    private void redimensionarPilha(int novaCapacidade, int tamV, int tamP) {
        Object[] b = new Object[novaCapacidade];

        // copia os elementos da pilha vermelha
         for (int i = 0; i < tamV; i++) {
             b[i] = a[i];
         }

        // copia os elementos da pilha preta
         for (int j=0; j < tamP; j++) {
             b[novaCapacidade - j - 1] = a[capacidade - j - 1];
         }

        // atualiza o topo da pilha preta
         tPreto = novaCapacidade - tamP;

         a = b;
         capacidade = novaCapacidade;

    }
    public int getCapacidade() {
    return capacidade;
}
}