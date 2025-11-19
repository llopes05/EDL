import javax.management.RuntimeErrorException;

public class Pilhan {
    protected int capacidade;
    protected Object[] a;
    protected int topo;

    public void push(Object r){
        if(topo == capacidade){
            int novaCapacidade = capacidade *2;
            Object[] b = new Object[novaCapacidade];
            for (int i = 0;i < topo; i ++){
                b[i] = a[i];
            }
            a = b;
            capacidade = novaCapacidade;
        }
        a[++topo] = r;
        
        


    }

    public Object pop(){
        if (isEmpty()){
            throw new RuntimeErrorException("pilha vazia")
        }
        
        Object rem = a[topo];                             
        a [topo] = null;                             
        topo--;                          
        return rem;                          
    }
    
    
}
