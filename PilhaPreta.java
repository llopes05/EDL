public class PilhaPreta extends PilhaArray{
    private int tpreto;
    public PilhaPreta(int capacidade){
        super(capacidade);
        tpreto = capacidade;
    }

    public void pushP(Object o){
        a[--tpreto] = o;
    }

    public boolean isEmptyP(){
        if (capacidade == tpreto)
            return true;
        return false;
        
    }

    public int sizeP(){
        return capacidade - tpreto;
    }

    public Object popP() throws PilhaVaziaExcecao{
        if(isEmptyP())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        
        Object rpreto = a[tpreto];
        a[tpreto] = null;
        tpreto++;
        return rpreto;
    }

    public Object topP() throws PilhaVaziaExcecao {
        if(isEmptyP())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        return a[tpreto];
    }



    
}