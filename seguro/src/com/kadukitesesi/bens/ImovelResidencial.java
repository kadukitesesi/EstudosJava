package com.kadukitesesi.bens;

public class ImovelResidencial implements BemSeguravel {
    private double valorDeMercado;
    private int areaConstruida;



    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorDeMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }
    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorDeMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorDeMercado = valorMercado;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.001;
        valorPremio += getAreaConstruida() * 0.3;

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Imovél de %d M2 construido e no valor de %.2f R$"
                ,getAreaConstruida(), getValorMercado());

    }
}
