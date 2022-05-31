import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = "" )
    void calculateSqrService() {
        SQRService service = new SQRService();
    }
}
