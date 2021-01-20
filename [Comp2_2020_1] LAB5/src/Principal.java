public class Principal {

    public static void main(String[] args) {
        DadosTriplos dadosTriplos = new DadosTriplos();
        DadosDeGamao dadosDeGamao = new DadosDeGamao();

        //JogoMalucoComSorteadores jogo1 = new JogoMalucoComSorteadores("jogo doído","zé","zezin",x,dadosDeGamao,dadosTriplos);

        for(int i=0;i<=100;i++){
            JogoMalucoComSorteadores jogo1 = new JogoMalucoComSorteadores("jogo doído","paulin","zezin",i,dadosDeGamao,dadosTriplos);
            System.out.println(jogo1.jogar());
        }
        
    }
}

//Extras

// - Responda, olhando os resultados: qual o melhor sorteador? Você saberia dizer isso antes de rodar o programa?

/* Dados triplos, sim pois multiplica o resultado de 3 dados. */



//   - É verdade que jogos com um número maior de rodadas tornam mais difícil a vitória ir para o jogador mais fraco?

/* Sim */