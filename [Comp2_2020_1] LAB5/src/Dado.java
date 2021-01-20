import java.util.Random;

public class Dado implements Sorteador {



    @Override
    public int sortear() {
        int result;
        Random sorteador = new Random();
        result=sorteador.nextInt(7);
        return result;
    }
}
