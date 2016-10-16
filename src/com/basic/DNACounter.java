package com.basic;

public class DNACounter {
    private DNA dna;

    public DNACounter(DNA dna) {
        this.dna = dna;
    }


    public  String count() {
        CharCounter charCounter = new CharCounter(dna.getDnaString(), "ACGT");
        return charCounter.finalResult();
    }
}
