package com.itb.mif3an.pizzaria.model;

import javax.swing.*;
public class Produto {


        //Encapsulamento: proteger meus atributos do acesso desordenado, pode estar ligado
        //ás questoes de validação

        //Para obter o encapsulamento temos que seguir alguns passos:
        //1° Passo: Trabalhar os modificadores de acesso
        //Temos três:
        //public -> Acesso livre para todas as classes
        //private -> Acesso permitido apenas dentro da classes
        // protect -> Acesso permitido apenas para as classes filhas (Herança)

        //Enfim, deixar os atributos private ou protected

        //2° Passo: criar métodos de acesso aos atributos, uma prática muito utilizada
        // é criar os métodos SETTER'S E GETTER'S
        //SET -> atribuir a informação
        //GET -> recuperar a informação
        private Long id;

        private String nome;

        private String tipo;

        private String descricao;

        private double precoVenda;

        private double precoCompra;

        private int quantidadeEstoque;

        private boolean codStatus;

        private String mensagemErro = "";
        private boolean isValid  = true;

        public Produto() {
        }

        public void setId(Long id){ //void = "mudo", o método não tem retorno
                this.id = id; //this é referencia do atributo da classe id; separa o atributo da variavel q tem o mesmo nome
        }

        //comando ALT + INSERT para gerar todos os getters e setters
        public Long getId(){
                return id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getTipo() {
                return tipo;
        }

        public void setTipo(String tipo) {
                this.tipo = tipo;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public double getPrecoVenda() {
                return precoVenda;
        }

        public void setPrecoVenda(double precoVenda) {
                this.precoVenda = precoVenda;
        }

        public double getPrecoCompra() {
                return precoCompra;
        }

        public void setPrecoCompra(double precoCompra) {
                this.precoCompra = precoCompra;
        }

        public int getQuantidadeEstoque() {
                return quantidadeEstoque;
        }

        public void setQuantidadeEstoque(int quantidadeEstoque) {
                this.quantidadeEstoque = quantidadeEstoque;
        }

        public boolean isCodStatus() {
                return codStatus;
        }

        public void setCodStatus(boolean codStatus) {
                this.codStatus = codStatus;
        }

        public String getMensagemErro() {
                return mensagemErro;
        }

        public boolean validarProduto() {

            if (nome == null || nome.isEmpty()){
                    mensagemErro += "O nome do produto é obrigatório:";
                    isValid = false;
            }
                if (precoCompra < 0){
                        precoCompra = 0;
                       mensagemErro += "O preço do produto deve ser maior que zero:";
                       isValid = false;
                }
                return isValid;
        }
}
