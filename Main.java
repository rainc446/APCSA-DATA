public class Main {
    public static void main(String[] args) {
        Data one = new Data(3,3);
        one.repopulate();
        System.out.println(one);
        int x = one.countIncreasingCols();
        System.out.println(x);
    }
}
