package goulart.rafael.drdisease;

public class Ranking {
    public String jogador;
    public String doenca;
    public String pais;
    public String dificuldade;
    public String agente;
    public int jogadas;
    public int cura;
    public int infectados;
    public int[] habilidades;

    public Ranking() {
        
    }

    public Ranking(String jogador, String doenca, String pais, String dificuldade, String agente, int jogadas, int cura, int infectados, int[] habilidades) {
        this.jogador = jogador;
        this.doenca = doenca;
        this.pais = pais;
        this.dificuldade = dificuldade;
        this.agente = agente;
        this.jogadas = jogadas;
        this.cura = cura;
        this.infectados = infectados;
        this.habilidades = habilidades;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public int getJogadas() {
        return jogadas;
    }

    public void setJogadas(int jogadas) {
        this.jogadas = jogadas;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    public int getInfectados() {
        return infectados;
    }

    public void setInfectados(int infectados) {
        this.infectados = infectados;
    }

    public int[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(int[] habilidades) {
        this.habilidades = habilidades;
    }
}