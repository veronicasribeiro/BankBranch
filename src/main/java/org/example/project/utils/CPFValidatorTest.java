package org.example.project.utils;

public class CPFValidatorTest {
    public static void main(String[] args) {
        String cpf1 = "529.982.247-25"; // Válido
        String cpf2 = "123.456.789-09"; // Válido
        String cpf3 = "111.444.777-35"; // Válido
        String cpf4 = "111.111.111-11"; // Inválido
        String cpf5 = "123.456.789-00"; // Inválido
        String cpf6 = "123.456.78"; // Inválido
        String cpf7 = "123a.456b.789c-09"; // Válido


        // Testes com CPFs válidos
        System.out.println("CPF: " + cpf1 + " é válido? " + CPFValidator.isValidCPF(cpf1));
        System.out.println("CPF: " + cpf2 + " é válido? " + CPFValidator.isValidCPF(cpf2));
        System.out.println("CPF: " + cpf3 + " é válido? " + CPFValidator.isValidCPF(cpf3));

        // Testes com CPFs inválidos
        System.out.println("CPF: " + cpf4 + " é válido? " + CPFValidator.isValidCPF(cpf4)); // Dígitos iguais
        System.out.println("CPF: " + cpf5 + " é válido? " + CPFValidator.isValidCPF(cpf5)); // Dígito verificador errado
        System.out.println("CPF: " + cpf6 + " é válido? " + CPFValidator.isValidCPF(cpf6)); // Menos de 11 dígitos

        // Testes com CPFs contendo caracteres não numéricos - Código capaz de remover os caracteres e fazer verificação
        System.out.println("CPF: " + cpf7 + " é válido? " + CPFValidator.isValidCPF(cpf7));
    }
}
