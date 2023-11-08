package project1.Class;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Product> produtosCozinha;
    private ArrayList<Product> produtosBar;

    public boolean criarNovoProduto(String tipo, String nome, float valor, int quantidadeEmEstoque) {
        Product novoProduto = null;
        if (tipo.equals("cozinha")) {
            novoProduto = new Product(tipo, nome, valor, quantidadeEmEstoque);
            produtosCozinha.add(novoProduto);
        } else if (tipo.equals("bar")) {
            novoProduto = new Product(tipo, nome, valor, quantidadeEmEstoque);
            produtosBar.add(novoProduto);
        } else {
            return false;
        }
        return true;
    }

    public ArrayList<Product> getProdutos() {
        ArrayList<Product> produtos = new ArrayList<>();
        produtos.addAll(produtosCozinha);
        produtos.addAll(produtosBar);
        return produtos;
    }

    public Product getProdutoSelecionado(String nome, String tipo) {
        if (tipo == "cozinha") {
            for (Product produto : produtosCozinha) {
                if (produto.getNome().equals(nome)) {
                    return produto;
                }
            }
        } else if (tipo == "bar") {
            for (Product produto : produtosBar) {
                if (produto.getNome().equals(nome)) {
                    return produto;
                }
            }
        }
        return null;
    }

    public boolean atualizarProduto(String nome, float valor, int quantidadeEmEstoque) {
        for (Product produto : produtosCozinha) {
            if (produto.getNome().equals(nome)) {
                produto.setValor(valor);
                produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
                return true;
            }
        }
        for (Product produto : produtosBar) {
            if (produto.getNome().equals(nome)) {
                produto.setValor(valor);
                produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
                return true;
            }
        }
        return false;
    }

    public boolean removerProduto(String nome, String tipo) {
        if (tipo == "cozinha") {
            for (Product produto : produtosCozinha) {
                if (produto.getNome().equals(nome)) {
                    produtosCozinha.remove(produto);
                    return true;
                }
            }
        } else if (tipo == "bar") {
            for (Product produto : produtosBar) {
                if (produto.getNome().equals(nome)) {
                    produtosBar.remove(produto);
                    return true;
                }
            }
        }
        return false;
    }

    public void entradaDeProduto(String nome, int quantidade) {
        for (Product produto : produtosCozinha) {
            if (produto.getNome().equals(nome)) {
                produto.entradaDeProduto(quantidade);
                return;
            }
        }
        for (Product produto : produtosBar) {
            if (produto.getNome().equals(nome)) {
                produto.entradaDeProduto(quantidade);
                return;
            }
        }
    }

    public void baixaDeProduto(String nome, int quantidade) {
        for (Product produto : produtosCozinha) {
            if (produto.getNome().equals(nome)) {
                produto.baixaDeProduto(quantidade);
                return;
            }
        }
        for (Product produto : produtosBar) {
            if (produto.getNome().equals(nome)) {
                produto.baixaDeProduto(quantidade);
                return;
            }
        }
    }
}
