public class PilhaDinamica {
    No inicio;

    //Inicialização/construtor da pilha dinâmica
    public PilhaDinamica(){
        this.inicio = null;
        System.out.println("Pilha dinâmica criada!");
    }

    public void exibir(){
        if(estaVazio()){
            System.out.println("Não é possivel exibir pois não há elementos na lista!");
        }else{
            No aux = this.inicio;
            while(aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    private boolean estaVazio(){
        if(this.inicio == null){
            System.out.println("A pilha está vazia!");
            return true;
        }
        return false;
    }

    public void empilhar(String elemento){
        if(elemento == null){
            System.out.println("O elemento não deve ser null!");
        }else{
            No ultimo = new No(elemento);
            ultimo.prox = this.inicio;
            this.inicio = ultimo;
            System.out.println("O elemento " + elemento + " foi empilhado!");
        }
    }

    public void desempilhar(){
        if(estaVazio()){
            System.out.println("Não há o que desempilhar!");
        }else{
            No aux = this.inicio;
            System.out.println("O elemento " + aux.getConteudo() + " foi desempilhado!");
            this.inicio = aux.getProx();
        }
    }


}
