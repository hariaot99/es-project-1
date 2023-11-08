package project1.Class;

import java.util.UUID;

public class Product {
    private UUID id;
    private String tipo;
    private String nome;
    private float valor;
    private int quantidadeEmEstoque;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public float getValor() {
        return this.valor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public UUID getId() {
        return this.id;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void entradaDeProduto(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void baixaDeProduto(int quantidade) {
        if (quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade em estoque insuficiente.");
        }
    }

    public Product(String tipo, String nome, float valor, int quantidadeEmEstoque) {
        this.id = UUID.randomUUID();
        this.tipo = tipo;
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

}
