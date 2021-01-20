public class DadosDeGamao implements Sorteador{




    @Override
    public int sortear() {
        int dado1;
        int dado2;
        int result;

        Dado dado = new Dado();
        dado1=dado.sortear();
        dado2=dado.sortear();
        result=dado1+dado2;

        if (dado1==dado2){
            return result*2;
        }
        else{
            return result;
        }
    }
}
