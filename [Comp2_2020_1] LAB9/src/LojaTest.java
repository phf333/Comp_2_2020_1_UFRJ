import org.junit.Test;



import static org.junit.Assert.*;

public class LojaTest {


    Loja loja;
    Livro livro;
    Usuario comprador;
    Transportadora jadlog;
    ImpressoraJatoDeTinta impressoraJatoDeTinta1;
    Grafica grafica1;

//    @Test
//    public void VendaComProdutoNoEstoque() throws
//            ItemNaoExisteNoCatalogoException, EstoqueInsuficienteException,
//            EnderecoInvalidoException, ErroNoPagamentoException {
//
//        jadlog = new Transportadora();
//        impressoraJatoDeTinta1 = new ImpressoraJatoDeTinta("HP", 2018);
//        grafica1 = new Grafica();
//
//        loja = new Loja(
//                jadlog,                // informamos à loja qual a transportadora que ela vai usar (agregação)
//                impressoraJatoDeTinta1);
//
//        livro = new Livro(12345, "Da Terra à Lua", "Julio Verne", null, 1865,CategoriaLivro.Ficção);
//        livro.setPrecoEmReais(25);
//
//        comprador = new Usuario(111111, "Maria");
//        comprador.setEndereco("Rua Tal, Numero Tal");
//
//        loja.incluirItem(livro,10);
//
//        loja.receberPedido(livro, 5, comprador);
//
//        assertEquals(loja.getQuantidadeEmEstoquePorItem(livro),5);
//
//
//    }
//
//
//    @Test
//    public void AdicionarQuantidadeDeItensNoEstaque() throws
//            ItemNaoExisteNoCatalogoException, EstoqueInsuficienteException,
//            EnderecoInvalidoException, ErroNoPagamentoException {
//        jadlog = new Transportadora();
//        impressoraJatoDeTinta1 = new ImpressoraJatoDeTinta("HP", 2018);
//        grafica1 = new Grafica();
//
//        loja = new Loja(
//                jadlog,                // informamos à loja qual a transportadora que ela vai usar (agregação)
//                impressoraJatoDeTinta1);
//
//        livro = new Livro(12345, "Da Terra à Lua", "Julio Verne", null, 1865,CategoriaLivro.Ficção);
//
//        loja.incluirItem(livro,10);
//        assertEquals(loja.getQuantidadeEmEstoquePorItem(livro),10);
//
//        loja.setQuantidadeEmEstoquePorItem(livro,5);
//        assertEquals(loja.getQuantidadeEmEstoquePorItem(livro),15);
//
//
//
//    }
//
//    @Test
//    public void RetirarQuantidadeDeItensNoEstaque() throws
//            ItemNaoExisteNoCatalogoException, EstoqueInsuficienteException,
//            EnderecoInvalidoException, ErroNoPagamentoException {
//        jadlog = new Transportadora();
//        impressoraJatoDeTinta1 = new ImpressoraJatoDeTinta("HP", 2018);
//        grafica1 = new Grafica();
//
//        loja = new Loja(
//                jadlog,                // informamos à loja qual a transportadora que ela vai usar (agregação)
//                impressoraJatoDeTinta1);
//
//        livro = new Livro(12345, "Da Terra à Lua", "Julio Verne", null, 1865,CategoriaLivro.Ficção);
//
//        loja.incluirItem(livro,10);
//        assertEquals(loja.getQuantidadeEmEstoquePorItem(livro),10);
//
//        loja.setQuantidadeEmEstoquePorItem(livro,-5); // retirar 5 livros do estoque
//        assertEquals(loja.getQuantidadeEmEstoquePorItem(livro),5);
//
//
//
//    }

    @Test
    public void testarVendaLivroDidaticoComDesconto() throws
            EnderecoInvalidoException, ItemNaoExisteNoCatalogoException,
            EstoqueInsuficienteException, ErroNoPagamentoException {
        jadlog = new Transportadora();
        impressoraJatoDeTinta1 = new ImpressoraJatoDeTinta("HP", 2018);
        grafica1 = new Grafica();

        loja = new Loja(
                jadlog,                // informamos à loja qual a transportadora que ela vai usar (agregação)
                impressoraJatoDeTinta1);

        comprador = new Usuario(111111, "Maria");
        comprador.setEndereco("Rua Tal, Numero Tal");

        livro = new Livro(1500, "Matematica", "Seu Zé", null, 2010,CategoriaLivro.Livro_Didático);
        livro.setPrecoEmReais(40.00f);

        loja.incluirItem(livro,10);

        String recibo = null;
        recibo = loja.receberPedido(livro,5,comprador);


        System.out.println(recibo);



    }
}



