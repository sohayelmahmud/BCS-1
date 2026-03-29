public class test {
    public static void main(String[] args) {
        int a=5, b=6, c=7, d=2;
        a = (++b) * 2 + (c--);
        System.out.println(a + " " + b + " " + c + " " + d);
        c = (a++) - (--d) + b;
        System.out.println(a + " " + b + " " + c + " " + d);
        b = (d--) + (c++) * ++a;
        System.out.println(a + " " + b + " " + c + " " + d);
        d = (--a) + (b++) - (c--);
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
