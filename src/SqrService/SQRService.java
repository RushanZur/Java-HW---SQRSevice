public class SQRService {
    public int calculateSquared() {
        SQRService service = new SQRService();
        int numberMin = 10;
        int numberMax = 99;
        int counter = 0;
        for (int i = numberMin; i < numberMax; i++)
            if (i * i >= 300 && i * i <= 900)
                counter++;
            System.out.println("Количество квадратов чисел в диапазоне равно " + counter++);
        return counter++;
    }
}