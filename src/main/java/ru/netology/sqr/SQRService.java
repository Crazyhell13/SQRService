package ru.netology.sqr;

public class SQRService {
    public int calculate(int bottomLine, int upperLine) {
        int numberOfSquares = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= upperLine & i * i >= bottomLine) {
                numberOfSquares = numberOfSquares + 1;
            }
        }
        return numberOfSquares;
    }
}