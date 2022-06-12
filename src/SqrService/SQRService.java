public class SQRService {
    public int rangeSqrService(int numberMin, int numberMax) {
        int counter = 0;
        for (int i = numberMin; i < numberMax; i++) {
            if (i * i >= 300 && i * i <= 900)
                counter++;
            return counter;

        }
        return 0;
    }
}