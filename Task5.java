package by.overone.lesson25homework;

public class Task5 {
    public static class MyExceptionNewOne extends RuntimeException {
        public MyExceptionNewOne(String description) {
            super(description);
        }


        public static void main(String[] args) throws MyExceptionNewOne {
            int a = 5;
            int b = 0;
            int c = a / b;
            try {
                System.out.println(c);
            } catch (ArithmeticException e) {
                throw new MyExceptionNewOne("ArithmeticException");
            }

        }
    }
}



