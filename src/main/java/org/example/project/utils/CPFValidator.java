package org.example.project.utils;

public class CPFValidator {
    public static boolean isValidCPF(String cpf) {

        // Remover caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verificar se o CPF tem 11 dígitos
        if (cpf.length() != 11){
            return false; // CPF inválido se não tiver 11 dígitos
        }

        return false;
    }
}
