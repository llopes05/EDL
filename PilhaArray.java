public class PilhaArray implements Pilha{
    protected int capacidade;
    protected Object[] a;
    protected int t;
    
    public PilhaArray(int capacidade){
        this.capacidade = capacidade;
        t=-1;
        a=new Object[capacidade];
        


    }
    
    
}
