package Arvore;

public class ArvoreBinaria {
    private class No {
        int valor;
        No filhoEsq;
        No filhoDir;
        No nodoPai;

        public No(int valor) {
            this.valor = valor;
            this.filhoEsq = null;
            this.filhoDir = null;
            this.nodoPai = null;
        }
    }

    private No root;

    public ArvoreBinaria() {
        this.root = null;
    }

    public boolean contem(int elemento) {
        return encontrarElemento(root, elemento) != null;
    }

    private No encontrarElemento(No noAtual, int elemento) {
        if (noAtual == null) {
            return null;
        }
        
        if (elemento < noAtual.valor) {
            return encontrarElemento(noAtual.filhoEsq, elemento);
        } else if (elemento > noAtual.valor) {
            return encontrarElemento(noAtual.filhoDir, elemento);
        } else {
            return noAtual; 
        }
    }
    public void adicionar(int elemento) {
        root = inserirNovo(root, elemento);
    }

    private No inserirNovo(No noAtual, int elemento) {
        if (noAtual == null) {
            return new No(elemento);
        }
        
        if (elemento < noAtual.valor) {
            noAtual.filhoEsq = inserirNovo(noAtual.filhoEsq, elemento);
            if (noAtual.filhoEsq != null) {
                noAtual.filhoEsq.nodoPai = noAtual;
            }
        } else if (elemento > noAtual.valor) {
            noAtual.filhoDir = inserirNovo(noAtual.filhoDir, elemento);
            if (noAtual.filhoDir != null) {
                noAtual.filhoDir.nodoPai = noAtual;
            }
        }
        
        return noAtual;
    }

    public void excluir(int elemento) {
        root = removerElemento(root, elemento);
    }

    private No removerElemento(No noAtual, int elemento) {
        if (noAtual == null) {
            return null;
        }

        if (elemento < noAtual.valor) {
            noAtual.filhoEsq = removerElemento(noAtual.filhoEsq, elemento);
        } else if (elemento > noAtual.valor) {
            noAtual.filhoDir = removerElemento(noAtual.filhoDir, elemento);
        } else {
            if (noAtual.filhoEsq == null) {
                return noAtual.filhoDir;
            }
            if (noAtual.filhoDir == null) {
                return noAtual.filhoEsq;
            }

            No menorNoDir = buscarMenorValor(noAtual.filhoDir);
            noAtual.valor = menorNoDir.valor;
            noAtual.filhoDir = removerElemento(noAtual.filhoDir, menorNoDir.valor);
        }
        return noAtual;
    }

    private No buscarMenorValor(No noAtual) {
        No temp = noAtual;
        while (temp.filhoEsq != null) {
            temp = temp.filhoEsq; 
        }
        return temp;
    }

    public void desenharEstrutura() {
        if (root == null) {
            System.out.println("Árvore está vazia!");
            return;
        }
        exibirArvore(root, 0);
    }

    private void exibirArvore(No noAtual, int nivel) {
        if (noAtual != null) {
            exibirArvore(noAtual.filhoDir, nivel + 1);
            
            for (int i = 0; i < nivel; i++) {
                System.out.print("    ");
            }
            System.out.println(noAtual.valor);
            
            exibirArvore(noAtual.filhoEsq, nivel + 1);
        }
    }
    public void listarEmOrdem() {
        System.out.print("Travessia em ordem: ");
        if (root == null) {
            System.out.println("(vazia)");
            return;
        }
        travessiaInOrder(root);
        System.out.println();
    }

    private void travessiaInOrder(No noAtual) {
        if (noAtual != null) {
            travessiaInOrder(noAtual.filhoEsq);
            System.out.print(noAtual.valor + " "); 
            travessiaInOrder(noAtual.filhoDir);
        }
    }
}