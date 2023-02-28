package br.edu.lucasdev.methods;

/**
 * Exercícios para exercitar o conceito de métodos
 */
public class Main {
    public static void main(String[] args) {
        // 1
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(1, 2.5));
        System.out.println(calculator.sub(1, 2.5));
        System.out.println(calculator.mult(1, 2.5));
        System.out.println(calculator.div(1, 2.5));

        // 2
        System.out.println(Main.greeting(22));

        // 3
        System.out.println(Main.loan(5000, 3));
    }

    public static String greeting(int hour) {
        if(hour < 12) return "Bom dia";
        else if(hour < 18) return "Boa tarde";
        else return "Boa noite";
    }

    public static double loan(double loanValue, int installments) {
        double fees = (0.02 * installments);
        return loanValue + (loanValue * fees);
    }
}
