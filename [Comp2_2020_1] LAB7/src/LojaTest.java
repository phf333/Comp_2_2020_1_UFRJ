import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class LojaTest {


    Loja lojaB;
    Livro livro3;
    Usuario comprador;
    Transportadora jadlog;
    ImpressoraJatoDeTinta impressoraJatoDeTinta1;
    Grafica grafica1;

    @Test
    public void VendaComProdutoNoEstoque() throws
            ItemNaoExisteNoCatalogoException, EstoqueInsuficienteException,
            EnderecoInvalidoException, ErroNoPagamentoException {

        jadlog = new Transportadora();
        impressoraJatoDeTinta1 = new ImpressoraJatoDeTinta("HP", 2018);
        grafica1 = new Grafica();

        lojaB = new Loja(
                jadlog,                // informamos à loja qual a transportadora que ela vai usar (agregação)
                impressoraJatoDeTinta1);

        livro3 = new Livro(12345, "Da Terra à Lua", "Julio Verne", null, 1865);
        livro3.setPrecoEmReais(25);

        comprador = new Usuario(111111, "Maria");
        comprador.setEndereco("Rua Tal, Numero Tal");

        lojaB.incluirItem(livro3,10);

        lojaB.receberPedido(livro3, 5, comprador);

        assertEquals(lojaB.getQuantidadeEmEstoquePorItem(livro3),5);


    }


    @Test
    public void AdicionarQuantidadeDeItensNoEstaque() throws
            ItemNaoExisteNoCatalogoException, EstoqueInsuficienteException,
            EnderecoInvalidoException, ErroNoPagamentoException {
        jadlog = new Transportadora();
        impressoraJatoDeTinta1 = new ImpressoraJatoDeTinta("HP", 2018);
        grafica1 = new Grafica();

        lojaB = new Loja(
                jadlog,                // informamos à loja qual a transportadora que ela vai usar (agregação)
                impressoraJatoDeTinta1);

        livro3 = new Livro(12345, "Da Terra à Lua", "Julio Verne", null, 1865);

        lojaB.incluirItem(livro3,10);
        assertEquals(lojaB.getQuantidadeEmEstoquePorItem(livro3),10);

        lojaB.setQuantidadeEmEstoquePorItem(livro3,5);
        assertEquals(lojaB.getQuantidadeEmEstoquePorItem(livro3),15);



    }

    @Test
    public void RetirarQuantidadeDeItensNoEstaque() throws
            ItemNaoExisteNoCatalogoException, EstoqueInsuficienteException,
            EnderecoInvalidoException, ErroNoPagamentoException {
        jadlog = new Transportadora();
        impressoraJatoDeTinta1 = new ImpressoraJatoDeTinta("HP", 2018);
        grafica1 = new Grafica();

        lojaB = new Loja(
                jadlog,                // informamos à loja qual a transportadora que ela vai usar (agregação)
                impressoraJatoDeTinta1);

        livro3 = new Livro(12345, "Da Terra à Lua", "Julio Verne", null, 1865);

        lojaB.incluirItem(livro3,10);
        assertEquals(lojaB.getQuantidadeEmEstoquePorItem(livro3),10);

        lojaB.setQuantidadeEmEstoquePorItem(livro3,-5); // retirar 5 livros do estoque
        assertEquals(lojaB.getQuantidadeEmEstoquePorItem(livro3),5);



    }



}