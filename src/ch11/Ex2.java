package ch11;

public class Ex2 {
    // This is Java
    boolean isEqual(Integer x, Integer y) {
        return x == y;
    }

    public void go() {
        System.out.println(isEqual(421, 421));
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.go();
    }
}
