public class Q1 {

    public static void funA() {
        int n = 1;
        int m = -1;
        if (n < -m) {System.out.print(n);}
        else {System.out.print(m);}
    }
    //_______________________________________
    public static void funB() {
        int n = 1;
        int m = -1;
        if (-n >= m) {System.out.print(n);}
        else {System.out.print(m);}
    }
    //_______________________________________
    public static void funC() {
        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1) {System.out.print(x);}
        else {System.out.print(y);}
    }
    //_______________________________________
    public static void funD() {
        double x = Math.sqrt(2);
        double y = 2;
        if (x * x == y) { System.out.print(x); }
        else { System.out.print(y); }
    }
    //_______________________________________
    public static void main(String[] args) {
         funA();
        System.out.println("\n---------------------------");
        funB();
        System.out.println("\n---------------------------");
        funC();
        System.out.println("\n---------------------------");
        funD();
        System.out.println("\n---------------------------");
    }
    }

