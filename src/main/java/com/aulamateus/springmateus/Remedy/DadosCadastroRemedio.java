package com.aulamateus.springmateus.Remedy;

//classe record não prcisa de geters setters e outras parafernalhas
public record DadosCadastroRemedio() {
        String name;
        Via via;
        String lot;
        Integer quantity;
        String validate;
        Laboratory laboratory;
}
