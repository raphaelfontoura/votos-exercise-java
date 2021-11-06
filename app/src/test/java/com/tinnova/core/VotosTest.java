package com.tinnova.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VotosTest {

    private Votos votos;
    private int totalVotos;
    private int validVotos;
    private int blankVotos;
    private int nullVotos;

    @BeforeEach
    void setUp() {
        this.totalVotos = 1000;
        this.validVotos = 800;
        this.blankVotos = 150;
        this.nullVotos = 50;
        this.votos = new Votos(totalVotos, validVotos, blankVotos, nullVotos);
    }

    @Test
    void shouldReturnValidPercentVotos() {
        double expectResult = 80;

        double result = votos.getValidPercent();

        Assertions.assertEquals(expectResult,result);
    }

    @Test
    void shouldReturnBlankPercentVotos() {
        double expectResult = 15;

        double result = votos.getBlankPercent();

        Assertions.assertEquals(expectResult,result);
    }

    @Test
    void shouldReturnNullPercentVotos() {
        double expectResult = 5;

        double result = votos.getNullPercent();

        Assertions.assertEquals(expectResult,result);
    }
}
