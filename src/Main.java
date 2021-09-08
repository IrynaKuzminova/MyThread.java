import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть число (кількість чисел Фібоначі яку Ви хочете побачити): ");
        int number=scanner.nextInt();
        MyThread myThread=new MyThread(number);
        myThread.start();
    }
}
