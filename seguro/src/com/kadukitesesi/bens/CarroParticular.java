package com.kadukitesesi.bens;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, int anoFabricacao, double valorDeMercado) {
        super(modelo, anoFabricacao, valorDeMercado);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorDeMercado() * 0.04;

        if (getAnoFabricacao() < 2000) {
            valorPremio *= 1.05;
        }

        return valorPremio;
    }

    public String descrever() {
        return String.format("Carro particular %s ano %d, avaliado em R$%.2f",
                getModelo(), getAnoFabricacao(), getValorDeMercado());
    }
}
