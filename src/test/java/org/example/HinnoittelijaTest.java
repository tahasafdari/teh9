package org.example;

class HinnoittelijaTest implements IHinnoittelija{
    private float alennus;
    public HinnoittelijaTest(float alennus) {
        this.alennus = alennus;
    }
    public float getAlennusProsentti(Asiakas asiakas, Tuote tuote) {
        return alennus;
    }

    @Override
    public void aloita() {

    }

    @Override
    public void setAlennusProsentti(Asiakas asiakas, float prosentti) {

    }

    @Override
    public void lopeta() {

    }

}