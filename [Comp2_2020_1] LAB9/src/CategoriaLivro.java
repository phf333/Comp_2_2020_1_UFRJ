public enum CategoriaLivro {

    Enciclopédia("ENC"),
    Livro_Didático("LD"),
    Ficção("FIC"),
    Biografia("BIO"),
    Arte("AR"),
    Dicionário("DIC"),
    Não_Ficção("NF");



    private String Codigo;

    CategoriaLivro(String codigo) {
        this.Codigo=codigo;
    }

    public String getCodigo() {
        return Codigo;
    }

}
