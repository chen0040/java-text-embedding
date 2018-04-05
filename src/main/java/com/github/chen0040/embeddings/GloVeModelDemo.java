package com.github.chen0040.embeddings;

public class GloVeModelDemo {
    public static void main(String[] args) {
        GloVeModel model = new GloVeModel();
        model.load100();
        System.out.println("word2em size: " + model.size());
    }

}
