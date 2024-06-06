package controle;

import modelo.Candidato;

public class ValidadorProcessoSeletivo {
    public boolean validarCandidato(Candidato candidato, int pontuacaoMinima) {
        return candidato.getPontuacao() >= pontuacaoMinima;
    }
}
