import java.util.Random;

public class JogoMalucoComSorteadores extends JogoDeDoisJogadores {

    private DadosDeGamao dado1;
    private DadosTriplos dado2;

    public JogoMalucoComSorteadores(String nomeJogo, String nomeJogador1, String nomeJogador2, int numeroDeRodadas, DadosDeGamao dado1,DadosTriplos dado2) {
        super(nomeJogo, nomeJogador1, nomeJogador2, numeroDeRodadas);

        this.dado1=dado1;
        this.dado2=dado2;


    }

    @Override
    protected int executarRodadaDoJogo() {
        int jogador1=dado1.sortear();
        int jogador2=dado2.sortear();

        if(jogador1>jogador2){
            return 1;
        }
        else if(jogador2>jogador1){
            return 2;
        }
        else{
            return 0;
        }
    }
}


//        Sorteador sorteador1 = new Sorteador() {
//            @Override
//            public int sortear() {
//                Random aleatorio = new Random();
//                return aleatorio.nextInt();
//            }
//        };
//        Sorteador sorteador2 = new Sorteador() {
//            @Override
//            public int sortear() {
//                Random aleatorio = new Random();
//                return aleatorio.nextInt();
//            }
//        };