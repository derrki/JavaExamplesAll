package com.EnumEx;

public enum Pronoun {
    I("я"), YOU("ти"), WE("ми"), THEY("вони"), HE("він"), SHE("вона"), IT("воно");

    String translation;

    private Pronoun(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

}
