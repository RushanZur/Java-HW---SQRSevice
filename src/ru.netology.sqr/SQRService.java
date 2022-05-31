public class SQRService {
    public int calculateSqrService(int number) {
        for (int i = 10; i <= number; i++)
        if (i * i > number) {
        return i ;}
        return 0;
    }
}