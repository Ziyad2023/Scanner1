import java.util.Scanner;

public class MyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");
        while (true) {
            if (scanner.hasNext()) {
                // 3
                //String str = scanner.next();
                //System.out.println(str);
            }
            
            if (scanner.hasNextInt()) {
                // 4
                //int i = scanner.nextInt();
                //System.out.println(i*3);
            }
            
            if (scanner.hasNext()) {
                // 5
                String str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}

