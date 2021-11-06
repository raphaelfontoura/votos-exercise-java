package com.tinnova.core;

public class Votos {

    private int totalVotos;
    private int validVotos;
    private int blankVotos;
    private int nullVotos;

    public Votos(int totalVotos, int validVotos, int blankVotos, int nullVotos) {
        this.totalVotos = totalVotos;
        this.validVotos = validVotos;
        this.blankVotos = blankVotos;
        this.nullVotos = nullVotos;
    }

    public double getBlankPercent() {
        var result = (double) blankVotos/totalVotos;
        return result * 100;
    }

    public double getValidPercent() {
        var result = (double) validVotos/totalVotos;
        return result * 100;
    }

    public double getNullPercent() {
        var result = (double) nullVotos / totalVotos;
        return result * 100;
    }
}
