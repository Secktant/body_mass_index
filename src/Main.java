public class Main {
    public static void main(String[] args) {
        BmiService service = new  BmiService();
        String Bmi = service.calculate(65, 165);
        System.out.println("Ваш индекс массы тела составляет " + Bmi);
    }
}