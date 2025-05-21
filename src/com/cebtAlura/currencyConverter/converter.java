package com.cebtAlura.currencyConverter;

/*
    Record to take the different currencies
    Peso argentino (ARS), Boliviano (BOB), Real brasileño (BRL),
    Peso chileno (CLP) y Peso colombiano (COP).
 */
public record converter(double USD, double ARS, double BOB, double BRL, double CLP,
                        double COP) {
}
