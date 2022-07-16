import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exem2 {
    public static void main(String[] arg) {

        //Scanner sc = new Scanner(System.in);
        //System.out.print("Ведите число: ");
        //int n = sc.nextInt();
        System.out.println("Ведите числы (Примерно так с пробелами 1 2 3 4 5 12 ...): ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> set = new HashSet<String>();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }
}
