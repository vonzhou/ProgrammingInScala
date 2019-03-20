package ch11;

public class Ex1 {
    // This is Java
    boolean isEqual(int x, int y) {
        return x == y;
    }

    public void go() {
        System.out.println(isEqual(421, 421));
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.go();
    }
}
