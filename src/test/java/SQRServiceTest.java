import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void shouldRangeSqrService() {
        SQRService service = new SQRService();
        int expected = 14;
        int actual = service.calculateSquared();
        assertEquals(expected, actual);
    }
}
