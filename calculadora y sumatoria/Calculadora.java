public class Calculadora {
    // Atributos
    private float memoria;

    // Constructor
    public Calculadora(float memoria) {
        this.memoria = memoria;
    }

    public float obtenerMemoria() {
        return this.memoria;
    }

    public void iniciarMemoria() {
        this.memoria = 0;
    }

    public float restar(float a, float b) {
        float resultado = a - b;
        this.memoria += resultado;
        return resultado;
    }

    public float multiplicar(float a, float b) {
        float resultado = a * b;
        this.memoria += resultado;
        return resultado;
    }

    public float dividir(float a, float b) {
        float resultado = a / b;
        this.memoria += resultado;
        return resultado;
    }

    public float sumar(float a, float b) {
        float resultado = a + b;
        this.memoria += resultado;
        return resultado;
    }
}
