import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting input 
        String []stringArray = inpuString.split("#");

        int m = Integer.parseInt(stringArray[0]);
        int n = Integer.parseInt(stringArray[1]);

        // declaring matrix
        int [][]matrix = new int[m][n];
        int index = 2;
        for(int i = 0; i < m; i++) {
            matrix[i] = Arrays.stream(stringArray[index++].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        // printing sum of alternate elements
        System.out.println(SumOfAlternateElement.sumOfAlternateElement(matrix, m, index));

        // closing resource
        sc.close();
    }
}
