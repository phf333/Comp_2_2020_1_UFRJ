import java.util.ArrayList;

public class Album {

    public static final int PERCENTUAL_MINIMO_PARA_AUTO_COMPLETAR = 90;  // 90%



    private int quantFigurinhasPorPacotinho;

    private int tamanhoDoAlbum;


    private ArrayList<Figurinha> AlbumArray;
    private ArrayList<Figurinha> figurinhasRepetidas = new ArrayList<>();

    public Album(int tamanhoDoAlbum, int quantFigurinhasPorPacotinho) {

        this.quantFigurinhasPorPacotinho = quantFigurinhasPorPacotinho;
        this.tamanhoDoAlbum=tamanhoDoAlbum;
        AlbumArray = new ArrayList<>(tamanhoDoAlbum);
    }

    public void receberNovoPacotinho(Pacotinho pacotinho) {
        for (Figurinha fig : pacotinho) {
            if(!AlbumArray.contains(fig)){
                AlbumArray.add(fig);
            }
            else{
                figurinhasRepetidas.add(fig);
            }
        }

    }
    public void autoCompletar() {
        // verifica se o álbum já está suficientemente cheio

    }

    public int getTamanho() {
        return this.tamanhoDoAlbum;
    }

    public int getQuantFigurinhasPorPacotinho() {
        return this.quantFigurinhasPorPacotinho;
    }

    public int getQuantFigurinhasColadas() {
        return AlbumArray.size();
    }

    public int getQuantFigurinhasRepetidas() {
        return figurinhasRepetidas.size();
    }

    public boolean possuiFigurinhaColada(int posicao) {
        return AlbumArray.contains(posicao);
    }

    public boolean possuiFigurinhaRepetida(int posicao) {
        boolean b = false;
        for (int i = 0; i < AlbumArray.size(); i++) {
            if (AlbumArray.get(i).equals(AlbumArray.get(posicao))) {
                b = true;
            }
        }
        return b;
    }

    public int getQuantFigurinhasFaltantes() {

        int faltantes=tamanhoDoAlbum-AlbumArray.size();
        return faltantes;

    }

    @Override
    public String toString() {
        return "Album{" +
                "AlbumArray=" + AlbumArray +
                '}';
    }
}

