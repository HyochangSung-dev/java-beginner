package cond.Ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 82;
        String hakjum;

        if (score >= 90) {
            hakjum = "A";
        } else if (score >= 80) {
            hakjum = "B";
        } else if (score >= 70) {
            hakjum = "C";
        } else if (score >= 60) {
            hakjum = "D";
        } else {
            hakjum = "F";
        }

        System.out.println("학점은 " + hakjum + "입니다.");
    }
}
