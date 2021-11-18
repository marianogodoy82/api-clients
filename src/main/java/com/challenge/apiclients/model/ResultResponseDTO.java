package com.challenge.apiclients.model;

public class ResultResponseDTO {
    private final Double average;
    private final Double standardDeviation;

    public ResultResponseDTO(Double average, Double standardDeviation) {
        this.average = average;
        this.standardDeviation = standardDeviation;
    }

    public Double getAverage() {
        return average;
    }

    public Double getStandardDeviation() {
        return standardDeviation;
    }
}
