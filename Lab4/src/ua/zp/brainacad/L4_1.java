package ua.zp.brainacad;

public class L4_1 {
    public static void main(String[] args) {
        boolean a = !(true && false || false && true) && !(true && 4 <= 5);
        System.out.println(a);
    }
}
