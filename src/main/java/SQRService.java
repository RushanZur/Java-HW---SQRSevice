public class SQRService {
    public int calculateSquared(int rangeMin, int rangeMax) {
        SQRService service = new SQRService();
        int numberMin = 10;
        int numberMax = 99;
        int counter = 0;
        for (int i = numberMin; i < numberMax; i++)
            if (i * i >= rangeMin && i * i <= rangeMax)
                counter++;
            System.out.println("Количество квадратов чисел в диапазоне равно " + counter++);
        return counter;
    }
}