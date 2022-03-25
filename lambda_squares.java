import java.util.Scanner;

interface testInt{
    int test(int a);
}


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        testInt kwadraty = (a) -> {
            for (int i=x; i<50; i++)
                System.out.println(i*i);

        return 0;}
        ;
        kwadraty.test(x);
    }
}
