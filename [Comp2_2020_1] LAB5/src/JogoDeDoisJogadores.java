import java.util.ArrayList;

public abstract class JogoDeDoisJogadores {

    private String nomeJogo;
    private String nomeJogador1;
    private String nomeJogador2;
    private int numeroDeRodadas;
    ArrayList<Integer> historicoResultados = new ArrayList<>();


    protected abstract int executarRodadaDoJogo();


    public JogoDeDoisJogadores(String nomeJogo,String nomeJogador1,String nomeJogador2,int numeroDeRodadas){
        this.nomeJogo=nomeJogo;
        this.nomeJogador1=nomeJogador1;
        this.nomeJogador2=nomeJogador2;
        this.numeroDeRodadas=numeroDeRodadas;


    }

    String  getNomeJogo() {
        return this.nomeJogo;
    }

    String getNomeJogador1() {
        return this.nomeJogador1;
    }

    String getNomeJogador2() {
        return this.nomeJogador2;
    }

    int getNumeroDeRodadas() {
        return this.numeroDeRodadas;
    }

    String jogar() {
        int pontosJogador1=0;
        int pontosJogador2=0;
        int pontosEmpate=0;
        for(int i=0;i<this.numeroDeRodadas;i++){
            int resparcial=executarRodadaDoJogo();
            if(resparcial==1){
                pontosJogador1=pontosJogador1+1;
                historicoResultados.add(resparcial);
            }
            else if(resparcial==2){
                pontosJogador2=pontosJogador2+1;
                historicoResultados.add(resparcial);
            }
            else{
                pontosEmpate=pontosEmpate+1;
                historicoResultados.add(resparcial);
            }
        }
        if(pontosJogador1>pontosJogador2){
            return "O jogador " + this.nomeJogador1 + " venceu o jogo "+ " por "+ pontosJogador2 +" a "+ pontosJogador1;
        }
        else if(pontosJogador2>pontosJogador1){
            return " O jogador " + this.nomeJogador2 + " venceu o jogo "+ " por "+ pontosJogador2 +" a "+ pontosJogador1;
        }
        else{
            return " O jogo terminou em empate após "+this.numeroDeRodadas;
        }
    }
}


