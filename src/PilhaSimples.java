public class PilhaSimples {
    Integer[] pilha;
    int tamanho;

    /*Apenas o ultimo elemento da pilha poderá ser manipulado, remoções e inserções só podem ser realizadas no final
     * da pilha, os ultimos serão os primeiros (literalmente)  */

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new Integer[tamanho];
        System.out.println("A pilha foi criada com sucesso! Ela possui " + tamanho + " espaços livres!");
    }

    public void empilhar(int x){
        if(estaCheia()){
            System.out.println("Não é possivel empilhar pois a pilha já está cheia!");
        }else{
            pilha[posicaoLivre()] = x ;
            System.out.println("O item " + x + " foi colocado na pilha!");
        }
    }

    public void desempilhar(){
        if(estaVazio()){
            System.out.println("Não há itens para serem removidos pois a pilha está vazia!");
        }else{
            pilha[ultimaPosicaoOcupada()] = null;
            System.out.println("O item do topo da lista foi removido");
        }
    }


    /*Este metodo foi criado com a intenção de achar a ultimaPosicao ocupada e o metodo desempilhar() usar ele
    para remover o ultimo elemento da pilha */
    private int ultimaPosicaoOcupada(){
        boolean achou = false;
        int posicaoOcupada = 0;

            do{
                if(pilha[posicaoOcupada] == null){
                    posicaoOcupada++;
                }else{
                    achou = true;
                }
            }while(achou != true);

            return posicaoOcupada;
    }

    /*Este metodo foi criado com a intenção de achar qual posição dentro da pilha esta livre para assim
    o metodo empilhar() colocar um elemento int x na determinada posição livre */
    private int posicaoLivre(){
        boolean achou = false;
        int i = 0 ;
        do{
            if(pilha[i] != null){
                i++;
            }else {
                achou = true;
            }
        }while(achou != true);
            return i ;
    }

    private boolean estaCheia() {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.pilha[i] == null) {
                return false;
            }
        }
        System.out.println("A Fila está cheia!");
        return true;
    }

    private boolean estaVazio() {
        if (this.pilha[0] == null) {
            System.out.println("A pilha está vazia.");
            return true;
        } else {
            return false;
        }
    }

    public void exibir () {
        if (!estaVazio()) {
            for (int i = 0; i < this.tamanho; i++) {
                System.out.println(this.pilha[i]);
            }
        }
    }

    public boolean tamanhoMaiorQueZero(int tamanho){
        return tamanho > 0;
    }
}
