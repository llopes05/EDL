public class PilhaVermelha extends PilhaArray{
    public PilhaVermelha(int capacidade){
        super(capacidade);
    }

    

    
    
    public void pushV(Object o){
        a[++t] = o;
    }

    public boolean isEmptyV(){
        return t == -1;
    }

    
    public int sizeV(){
        return t + 1;
    }
    
    public Object popV() throws PilhaVaziaExcecao{
        if (isEmptyV())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        Object r = a[t];
        a[t] = null;
        t--;
        return r;
    }

    public Object topV() throws PilhaVaziaExcecao{
        if (isEmptyV())
            throw new PilhaVaziaExcecao("A pilha está vazia");
        return a[t];
    }

}