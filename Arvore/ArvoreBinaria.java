package Arvore;

public class ArvoreBinaria {
    private class No {
        int chave;
        No Fesquerdo;
        No Fdireito;
        No pai;

        public No(int chave) {
            this.chave = chave;
            this.Fesquerdo = null;
            this.Fdireito = null;
            this.pai = null;
        }
    }
}