public class SumOfAlternateElement {
    public static int sumOfAlternateElement(int [][]matrix, int m, int n) {
        // declaring variables
        int sum = 0;
        boolean flag = true;

        // calculating sum of alternate elements
        for(int []arr : matrix) {
            for(int element : arr) {
                if(flag) {
                    sum += element;
                    flag = false;
                } else {
                    flag = true;
                }
            }
        }

        // return sum 
        return sum;
    }
}
