package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource (
            value ={
                    "'shouldCalculateNumberOfSquaresRandom',500, 800, 6",
                    "'shouldCalculateNumberOfSquares10',100, 100, 1",
                    "'shouldCalculateNumberOfSquares99',100, 9801, 90",
                    "'shouldCalculateNumberOfSquares100',10000, 1000, 0"

            }
    )
    public void shouldCalculate(String test, int bottomLine, int upperLine, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(bottomLine,upperLine);
        assertEquals(expected, actual);
    }
}