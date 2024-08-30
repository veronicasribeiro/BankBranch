package org.example.project.utils;

public class CPFValidator {
    public static boolean isValidCPF(String cpf) {

        // Remover caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verificar se o CPF tem 11 dígitos e se não são todos iguais
        if (cpf.length() != 11 || cpf.chars().distinct().count() == 1){
            return false; // CPF inválido se não tiver 11 dígitos ou se todos os dígitos forem iguais
        }

        return false;
    }

    // Cálculo do dígito verificador
    private static int calculateCheckDigit(String cpf, int initialWeight){
        // Inicializa a soma para armazenar o resultado do cálculo do dígito verificador
        int sum = 0;

        // Calcula a soma dos produtos dos dígitos do CPF pelo peso correspondente
        for (int i = 0; i < cpf.length(); i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * initialWeight--;
        }

        return sum;
    }
}
