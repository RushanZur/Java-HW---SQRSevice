import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void shouldRangeSqrService() {
        SQRService service = new SQRService();
        int expected = 14;
        int actual = service.calculateSquared(300,900);
        assertEquals(expected, actual);
    }
    @Test
    void rangeMinimal() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculateSquared(99,100);
        assertEquals(expected, actual);
    }

    @Test
    void rangeMaximal() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculateSquared(9801,9802);
        assertEquals(expected, actual);
    }
}
