package composicao;

import java.util.ArrayList;
import java.util.List;

class Computador {
    String marca;
    String modelo;
    int ano;
    List<processador> processadores;

    public Computador(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.processadores = new ArrayList<>();
    }

    void adicionarProcessador(processador processador) {
        processadores.add(processador);
        System.out.println("Processador adicionado: " + processador.informacoes());
    }

    void removerProcessador(processador processador) {
        if (processadores.remove(processador)) {
            System.out.println("Processador removido.");
        } else {
            System.out.println("Processador não encontrado.");
        }
    }

    void listarProcessadores() {
        if (processadores.isEmpty()) {
            System.out.println("Nenhum processador instalado.");
            return;
        }
        for (processador p : processadores) {
            System.out.println(p.informacoes());
        }
    }

    String informacoes() {
        return "Computador: " + marca + " " + modelo + " (" + ano + ")";
    }

    void verificarEstadoProcessadores() {
        for (processador p : processadores) {
            if (!p.verificarTemperatura()) {
                System.out.println("Atenção! O processador " + p.modelo + " está superaquecendo!");
            } else {
                System.out.println("O processador " + p.modelo + " está funcionando normalmente.");
            }
        }
    }
}
