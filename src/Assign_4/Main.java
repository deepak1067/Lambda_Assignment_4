package Assign_4;

public class Main {
    public static void main(String[] args) {
        Assign_4 lambda=(x, y) -> {
            long result = x;
            for(long i = x + 1; i <= y; i++){
                result *= i;
            }
            return result;
        };
        System.out.println(lambda.result(1,4));
    }
}
