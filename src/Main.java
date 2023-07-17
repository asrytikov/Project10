

public class Main {

    static int z1 = 10;
    static int z2 = 10;

    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = (x, y)->x+y;
        System.out.println(myNumber.getValue(10, 20));
        MyNumber myNumber1 = (x, y) -> x*y;
        System.out.println(myNumber1.getValue(10, 10));
        MyNumber myNumber2 = (int x, int y) -> x - y;

        MyNumb myNumb = n -> n * n;

        Printable printable = s -> System.out.println(s);
        printable.print("Hello");

        Operation operation = () -> {
            z1 = 20;
            return z1+z2;
        };

        System.out.println(operation.calc());
        System.out.println(z1);

        final int c1 = 70;
        final int c2 = 50;

        Operation operation1 = () -> {
            //c1 = 100;
            return c1+c2;
        };
        System.out.println(operation1.calc());

        MyNumber operation2 = (x, y) -> {

            if (x==0)
                return 0;
            else
                return y/x;
        };

        System.out.println(operation2.getValue(20, 30));
        System.out.println(operation2.getValue(0, 10));

        Opertionable<Integer> op1 = (x, y) -> x + y;
        Opertionable<String> op2 = (x, y) -> x + y;

        System.out.println(op1.calculate(10, 20));
        System.out.println(op2.calculate("20", "10"));

    }
}

interface Opertionable<T>{
    T calculate(T x, T y);
}

interface Operation{
    int calc();
}

@FunctionalInterface
interface MyNumber{
    double getValue(int x, int y);
}

@FunctionalInterface
interface MyNumb{
    double getVal(int n);
}

interface Printable{
    void print(String s);
}