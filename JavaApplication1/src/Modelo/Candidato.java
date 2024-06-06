package modelo;

public class Candidato {
    private String nome;
    private String cpf;
    private int pontuacao;

    public Candidato(String nome, String cpf, int pontuacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
