package project1.Class;

import java.util.ArrayList;

public class Restaurant {
    private String razaoSocial;
    private String endereco;
    private String cnpj;
    private ArrayList<User> usuarios;
    private Menu cardapio;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<User> usuarios) {
        this.usuarios = usuarios;
    }

    public boolean criarNovoProduto(String tipo, String nome, float valor, int quantidadeEmEstoque) {
        if (validarDados(tipo, nome, valor, quantidadeEmEstoque)) {
            return cardapio.criarNovoProduto(tipo, nome, valor, quantidadeEmEstoque);
        }
        return false;
    }

    public boolean validarDados(String tipo, String nome, float valor, int quantidadeEmEstoque) {
        if (tipo == null || nome == null || valor <= 0 || quantidadeEmEstoque < 0) {
            return false;
        }
        return true;
    }

    public boolean novosDadosProduto(String tipo, String nome, float valor, int quantidadeEmEstoque) {
        if (validarDados(tipo, nome, valor, quantidadeEmEstoque)) {
            return cardapio.atualizarProduto(nome, valor, quantidadeEmEstoque);
        }
        return false;
    }

    public ArrayList<Product> listarProdutos() {
        return cardapio.getProdutos();
    }

    public void atualizarProduto(String tipo, String nome, float valor, int quantidadeEmEstoque) {
        if (validarDados(tipo, nome, valor, quantidadeEmEstoque)) {
            cardapio.atualizarProduto(nome, valor, quantidadeEmEstoque);
        }
    }

    public Product produtoSelecionado(String nome, String tipo) {
        return cardapio.getProdutoSelecionado(nome, tipo);
    }

    public boolean excluirProduto(String name, String tipo) {
        if (validarDados(tipo, name, 0, 0)) {
            return cardapio.removerProduto(name, tipo);
        }
        return false;
    }
}
