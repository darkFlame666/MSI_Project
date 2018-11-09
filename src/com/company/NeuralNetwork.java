package com.company;

import java.util.stream.IntStream;

public class NeuralNetwork {
    static enum LayerType {I, H, O}
    final static  int INPUT_NEURONS = 3;
    final static int HIDDEN_NEURONS = 3;
    final static int OUTPUT_NEURONS = 3;
    private Neuron[] neurons = new Neuron [INPUT_NEURONS + HIDDEN_NEURONS + OUTPUT_NEURONS];
    public NeuralNetwork(){
        IntStream.range(0, INPUT_NEURONS).forEach(i -> neurons[i] = new Neuron(LayerType.I));
        IntStream.range(INPUT_NEURONS, INPUT_NEURONS + HIDDEN_NEURONS).forEach(i -> neurons[i] = new Neuron(LayerType.H));
        neurons[INPUT_NEURONS + HIDDEN_NEURONS] = new Neuron(LayerType.O);
    }
}
