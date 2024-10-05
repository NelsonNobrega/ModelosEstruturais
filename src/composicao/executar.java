package composicao;

public class executar {
    public static void main(String[] args) {
 
        Computador computador = new Computador("Dell", "Inspiron 15", 2021);

        processador p1 = new processador("Intel", "Core i5", 2.5, 4, 70);
        processador p2 = new processador("AMD", "Ryzen 5", 3.0, 6, 80);

        computador.adicionarProcessador(p1);
        computador.adicionarProcessador(p2);

        System.out.println("\nListando Processadores:");
        computador.listarProcessadores();

        System.out.println("\nVerificando Estado dos Processadores:");
        computador.verificarEstadoProcessadores();

        System.out.println("\nInformações do Computador:");
        System.out.println(computador.informacoes());

        computador.removerProcessador(p1);

        System.out.println("\nApós Remoção de um Processador:");
        computador.listarProcessadores();

        System.out.println("\nVerificando Estado dos Processadores Após Remoção:");
        computador.verificarEstadoProcessadores();
    }
}