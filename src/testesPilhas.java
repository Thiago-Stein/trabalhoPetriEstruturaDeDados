public class testesPilhas {
    public static void main(String[] args) {
        PilhaDinamica dinamica = new PilhaDinamica();

        dinamica.empilhar("Arroz");
        dinamica.empilhar("Feijão");
        dinamica.empilhar("Frango");
        dinamica.exibir();

        dinamica.desempilhar();
        dinamica.exibir();

        dinamica.desempilhar();
        dinamica.exibir();

        dinamica.desempilhar();
        dinamica.exibir();

    }
}
