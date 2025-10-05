public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto(0, "", 0, 0, 0);

        p1.setCodigo(1);
        p1.setNome("Notebook");
        p1.setPreco(5000);
        p1.setQuantidadeEstoque(5);
        p1.setEstoqueMinimo(3);
        p1.exibirDados();
        p1.vender(5);
        p1.repor(2);
        p1.aplicarDesconto(10);
        p1.verificarEstoqueBaixo();
        p1.vender(3);
        p1.exibirDados();
        
    }
}
