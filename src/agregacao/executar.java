package agregacao;

public class executar {
    public static void main(String[] args) {
       
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua das Flores, 123", "9h - 17h");

        Livro livro1 = new Livro("O Senhor dos Anéis", "Fantasia", 1200);
        Livro livro2 = new Livro("1984", "Ficção Científica", 328);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("\nListando Livros:");
        biblioteca.listarLivros();

        livro1.emprestar();

        livro1.emprestar();

        livro1.devolver();

        biblioteca.removerLivro(livro2);

        System.out.println("\nApós Remoção de um Livro:");
        biblioteca.listarLivros();
    }
}