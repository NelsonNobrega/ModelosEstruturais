package agregacao;


class Livro {
    String nome;
    String genero;
    int quantidadePaginas;
    boolean disponivel;

    public Livro(String nome, String genero, int quantidadePaginas) {
        this.nome = nome;
        this.genero = genero;
        this.quantidadePaginas = quantidadePaginas;
        this.disponivel = true; 
    }

    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Você emprestou: " + nome);
        } else {
            System.out.println("O livro " + nome + " não está disponível.");
        }
    }

    void devolver() {
        disponivel = true;
        System.out.println("Você devolveu: " + nome);
    }
}