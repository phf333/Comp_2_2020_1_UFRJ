public class DadosTriplos implements Sorteador {
    @Override

    public int sortear() {
        int result=0;
        int valor;
        Dado dado= new Dado();
        for(int i=0;i<3;i++){
            valor=dado.sortear();
            result=result+valor;

        }
        return result;
    }
}
