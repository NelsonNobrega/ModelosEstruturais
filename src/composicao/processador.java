package composicao;

class processador {
    String marca;
    String modelo;
    double frequencia; 
    int nucleos;
    double temperatura;

    public processador(String marca, String modelo, double frequencia, int nucleos, double temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.nucleos = nucleos;
        this.temperatura = temperatura;
    }

    String informacoes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Frequência: " + frequencia + " GHz, Núcleos: " + nucleos;
    }

    boolean verificarTemperatura() {
        return temperatura < 85; 
    }
}