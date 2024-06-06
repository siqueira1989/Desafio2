package Visao;

import modelo.Candidato;
import modelo.ProcessoSeletivo;
import controle.ValidadorProcessoSeletivo;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessoSeletivo processo = new ProcessoSeletivo();
        ValidadorProcessoSeletivo validador = new ValidadorProcessoSeletivo();

        System.out.println("Cadastro de Candidatos para Processo Seletivo");
        for (int i = 0; i < 3; i++) {  // Cadastro de 3 candidatos para exemplo
            System.out.print("Nome do candidato: ");
            String nome = scanner.nextLine();
            System.out.print("CPF do candidato: ");
            String cpf = scanner.nextLine();
            System.out.print("Pontuação do candidato: ");
            int pontuacao = Integer.parseInt(scanner.nextLine());

            Candidato candidato = new Candidato(nome, cpf, pontuacao);
            processo.adicionarCandidato(candidato);

            boolean aprovado = validador.validarCandidato(candidato, 70);
            if (aprovado) {
                System.out.println("Candidato aprovado!");
            } else {
                System.out.println("Candidato reprovado.");
            }
        }

        scanner.close();
    }
}
