public class MyThread extends Thread {
    private Integer countNumbers;
    private Integer first;
    private Integer second;

    public MyThread(Integer countNumbers) {
        this.countNumbers = countNumbers;
        first = 0;
        second = 1;
    }
        @Override
        public void run () {
            if (countNumbers <= 1) {
                System.out.println(first);
            } else if (countNumbers == 2) {
                System.out.println(first);
                System.out.println(second);
            } else {
                System.out.println(first);
                System.out.println(second);
                for (int i = 0; i < countNumbers - 2; i++) {
                    Integer summa = first + second;
                    System.out.println(summa);
                    first = second;
                    second = summa;
                }
            }
        }
    }
