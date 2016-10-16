package com.basic;

public class DNAToRNAConvertor {
    private DNA dna;

    public DNAToRNAConvertor(DNA dna) {
        this.dna = dna;
    }

    public RNA getRNA() {
        return new RNA(this.dna.getDnaString().replace("T", "U"));
    }

}
