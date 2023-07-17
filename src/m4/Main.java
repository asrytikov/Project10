package m4;

public class Main {

    public static void main(String[] args) {
        Oper func = action(1);
        int a = func.exec(5, 6);
        System.out.println(a);

        int b = action(2).exec(8, 2);
        System.out.println(b);
    }

    private static Oper action(int num){
        switch (num){
            case 1: return ((x, y) -> x+y);
            case 2: return ((x, y) -> x-y);
            case 3: return ((x, y) -> x*y);
            default: return ((x, y) -> 0);
        }
    }

}

interface Oper{
    int exec(int x, int y);
}