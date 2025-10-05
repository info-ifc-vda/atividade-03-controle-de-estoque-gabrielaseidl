public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int estoqueMinimo;

    public Produto(int codigo, String nome, double preco, int quantidadeEstoque, int estoqueMinimo) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("\nQuantidade inválida para venda.");
            return;
        }
        if (quantidade > quantidadeEstoque) {
            System.out.println("\nImpossivel vender "+quantidade+ ". Quantidade em estoque é de "+quantidadeEstoque);
            return;
        }

        quantidadeEstoque -= quantidade;
        System.out.println("\nVenda de "+quantidade+" produtos realizada com sucesso!");
    }

    public void repor(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("\nQuantidade inválida para reposição.");
            return;
        }
        quantidadeEstoque += quantidade;
        System.out.println("\nEstoque reposto com "+quantidade+" produtos.");
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double novoPreco = preco - (preco * percentual / 100);
            if (novoPreco < 0) {
                System.out.println("\nDesconto resultaria em preço negativo. Operação não permitida.");
                return;
            }
            preco = novoPreco;
            System.out.println("\nDesconto de " + percentual + "% aplicado com sucesso!");
        } else {
            System.out.println("\nPercentual de desconto inválido.");
        }
    }

    public void verificarEstoqueBaixo() {
        if (quantidadeEstoque < estoqueMinimo) {
            System.out.println("\nEstoque baixo. Temos apenas " + quantidadeEstoque + " unidades em estoque.");
        } else {
            System.out.println("\nEstoque normal. Temos " + quantidadeEstoque + " unidades em estoque.");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("\nCódigo inválido. Deve ser maior que zero.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("\nNome inválido.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("\nO preço não pode ser negativo.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("\nQuantidade em estoque inválida.");
        }
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        if (estoqueMinimo >= 0) {
            this.estoqueMinimo = estoqueMinimo;
        } else {
            System.out.println("\nEstoque mínimo inválido.");
        }
    }

    public void exibirDados() {
        System.out.println("\n===============================");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Estoque mínimo: " + estoqueMinimo);
        System.out.println("===============================\n");

    }
}
