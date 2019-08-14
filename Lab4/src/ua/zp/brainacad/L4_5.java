package ua.zp.brainacad;

public class L4_5 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = -4; i <= 9; i++) {
                if (j == 3) {
                    System.out.println(i);
                    j = 0;
                }
                j++;
        }
    }
}
