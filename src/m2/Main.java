package m2;

public class Main {

    public static void main(String[] args) {
        int[] nums = {-5, -4, -3, -2, -1, 1,2,3,4,5,6,7,8,9,0};
        System.out.println(sum(nums, ExpHelp::isEv));

        Expression expression = ExpHelp::isPos;
        System.out.println(sum(nums, expression));
    }

    private static int sum(int[] numbers, Expression func){
        int res = 0;
        for (int i: numbers) {
            if (func.isEqual(i)){
                res += i;
            }
        }
        return res;
    }

}

class ExpHelp{
    static boolean isEv(int n){
        return n%2 ==0;
    }

    static boolean isPos(int n){
        return n>0;
    }
}

interface Expression{
    boolean isEqual(int n);
}