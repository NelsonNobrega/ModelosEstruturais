package agregacao;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    String nome;
    String endereco;
    String horarioFuncionamento;
    List<Livro> livros;

    public Biblioteca(String nome, String endereco, String horarioFuncionamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.horarioFuncionamento = horarioFuncionamento;
        this.livros = new ArrayList<>();
    }

    void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.nome);
    }

    void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro.nome);
        } else {
            System.out.println("Livro não encontrado: " + livro.nome);
        }
    }

    void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro disponível na biblioteca.");
            return;
        }
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            System.out.println("- " + livro.nome + " (" + livro.genero + ")");
        }
    }
}