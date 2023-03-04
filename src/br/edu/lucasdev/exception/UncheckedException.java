package br.edu.lucasdev.exception;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean validate = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int result = Integer.parseInt(a) / Integer.parseInt(b);
                JOptionPane.showMessageDialog(null, "O resultado é " + result);
                validate = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro na operação, informe valores válidos \nError Message (" + e.getMessage() + ")");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Não é possível dividir um número por Zero");
            } finally {
                System.out.println("Bloco Finally");
            }
        } while (validate);
    }
}
