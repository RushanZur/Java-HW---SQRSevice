
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'squares within',200,300,3",
            "'squares out, lower range',0,99,0",
            "'squares within, on the border',100,600,15",
            "'squares out, upper range',9800,9900,0"})
    void squaresCalculator(String testName, int rangeMin, int rangeMax, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSquared(rangeMin, rangeMax);
        assertEquals(expected, actual);
    }

}
