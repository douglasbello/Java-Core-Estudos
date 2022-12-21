package entities;

public class Jogador {
    private String numero;
    private String nomeJogador;
    private String posicao;
    private String situacao = "NORMAL";
    private boolean participouPartida = false;

    public Jogador() {

    }
    public Jogador(String numero,String nomeJogador,String posicao) {
        this.numero = numero;
        this.nomeJogador = nomeJogador;
        this.posicao = posicao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public boolean getParticipouPartida() {
        return participouPartida;
    }

    public void setParticipouPartida(boolean participouPartida) {
        this.participouPartida = participouPartida;
    }
}
