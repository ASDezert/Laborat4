package ua.zp.brainacad;

public class L4_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        for (int i = 1; i <= b; i++) {
            a *= i;
            if (a > 1000){
                System.out.println("Достигнут максимально возможный результат");
                break;
            }
            System.out.println(a);
        }
    }
}
