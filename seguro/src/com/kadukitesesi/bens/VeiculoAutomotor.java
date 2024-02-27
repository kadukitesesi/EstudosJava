package com.kadukitesesi.bens;

abstract public class VeiculoAutomotor implements BemSeguravel {

    private String modelo;
    private double valorDeMercado;
    private int anoFabricacao;

    public VeiculoAutomotor(String modelo, int anoFabricacao, double valorMercado) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorDeMercado = valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
