public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int numberMin = 10;
        int numberMax = 99;
        int counter = service.rangeSqrService(numberMin, numberMax);
        System.out.println("Количество сумм квадратов = " + counter);
    }
}

