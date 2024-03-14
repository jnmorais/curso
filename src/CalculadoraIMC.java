public class CalculadoraIMC {
    public static void main(String[] args) {
        // Chamando um exemplo de entrada manual para testar o algoritmo
        double peso = 75; // Peso em kg
        double altura = 1.75; // Altura em metros

        // Calculando IMC para homens e mulheres
        double imcHomens = calcularIMC(peso, altura);
        double imcMulheres = calcularIMCMulheres(peso, altura);

        // Determinando a condição com base no IMC para homens e mulheres
        String condicaoHomens = determinarCondicaoHomens(imcHomens);
        String condicaoMulheres = determinarCondicaoMulheres(imcMulheres);

        System.out.println("Condição para Homens: " + condicaoHomens);
        System.out.println("Condição para Mulheres: " + condicaoMulheres);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularIMCMulheres(double peso, double altura) {
        // Ajuste do IMC para mulheres
        return peso / (altura * altura) - 1;
    }

    public static String determinarCondicaoHomens(double imc) {
        if (imc < 20.7) {
            return "Abaixo do peso";
        } else if (imc < 26.4) {
            return "No peso normal";
        } else if (imc < 27.8) {
            return "Marginalmente acima do peso";
        } else if (imc < 31.1) {
            return "Acima do peso ideal";
        } else if (imc < 34.5) {
            return "Obesidade grau I";
        } else {
            return "Obesidade grau II ou superior";
        }
    }

    public static String determinarCondicaoMulheres(double imc) {
        if (imc < 19.1) {
            return "Abaixo do peso";
        } else if (imc < 25.8) {
            return "No peso normal";
        } else if (imc < 27.3) {
            return "Marginalmente acima do peso";
        } else if (imc < 32.3) {
            return "Acima do peso ideal";
        } else if (imc < 37) {
            return "Obesidade grau I";
        } else {
            return "Obesidade grau II ou superior";
        }
    }
}

