/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.dev.lionn.sistema;

import java.util.Scanner;

/**
 *
 * @author sesi2dia
 */
public class Sistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] id = new int[10];
        String[] nome = new String[10];
        long[] telefone = new long[10];
        int[] dia = new int[10];
        int[] mes = new int[10];
        int[] ano = new int[10];

        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Cadastrando Aluno " + (i + 1) + " ---");

            System.out.print("ID: ");
            id[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            nome[i] = scanner.nextLine();

            System.out.print("Telefone: ");
            telefone[i] = scanner.nextLong();

            System.out.print("Dia do nascimento: ");
            dia[i] = scanner.nextInt();

            System.out.print("Mês do nascimento: ");
            mes[i] = scanner.nextInt();

            System.out.print("Ano do nascimento: ");
            ano[i] = scanner.nextInt();

            total++;

            System.out.print("Deseja cadastrar outro aluno? (1 - Sim / 0 - Não): ");
            int continuar = scanner.nextInt();

            if (continuar == 0) {
                break;
            }
        }

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("ID NOME TELEFONE DATA NASC.");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < total; i++) {

            String textoDia = "";
            if (dia[i] < 10) {
                textoDia = "0" + dia[i];
            } else {
                textoDia = "" + dia[i];
            }

            String textoMes = "";
            if (mes[i] < 10) {
                textoMes = "0" + mes[i];
            } else {
                textoMes = "" + mes[i];
            }

            String dataNascimento = textoDia + "/" + textoMes + "/" + ano[i];

            System.out.println(id[i] + " " + nome[i] + " " + telefone[i] + " " + dataNascimento);
        }

        System.out.println("-------------------------------------------------------------");
        scanner.close();
    }
}
