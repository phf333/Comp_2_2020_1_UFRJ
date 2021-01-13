public class Figurinha {

    private int posicao;

    public Figurinha(int posicao) {
        this.posicao=posicao;

    }

    /**
     * @return A posição que esta figurinha deve ocupar no álbum
     */
    public int getPosicao() {
        return this.posicao;
    }

    @Override
    public String toString() {
        return "Figurinha{" +
                "posicao=" + posicao +
                '}';
    }
}
