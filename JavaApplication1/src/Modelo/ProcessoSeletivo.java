package modelo;

import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    private List<Candidato> candidatos = new ArrayList<>();

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }
}
