package ch19.variance;

/**
 * @author vonzhou
 * @date 2019/3/20
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String[] a1 = {"abc"};
        Object[] a2 = a1;
        // 抛出 ArrayStoreException
        a2[0] = new Integer(19);
        String s = a1[0];
        System.out.println(s);
    }
}
