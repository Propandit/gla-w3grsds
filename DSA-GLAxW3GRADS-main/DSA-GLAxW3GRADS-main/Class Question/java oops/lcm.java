import java.util.Scanner;

class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            findNumbers(n);
        }
    }

    private static void findNumbers(int n) {       
        int x, y;

        
        if (n % 2 == 0) {
            x = y = n / 2;
        } else {
            
            x = (n - 1) / 2;
            y = (n + 1) / 2;
        }

        System.out.println(x + " " + y);
    }
}
