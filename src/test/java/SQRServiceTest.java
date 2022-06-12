import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void shouldRangeSqrService() {
        SQRService service = new SQRService();
        int expected = 13;
        int actual = service.rangeSqrService(300,900);
        assertEquals(expected, actual);
    }
}
