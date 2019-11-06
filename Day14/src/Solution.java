import java.util.*;
class Difference {
    private int[] elements;
    public int maximumDifference;
    Difference(int[] e)
    {
        this.elements = e;
    }
    void computeDifference()
    {
        Arrays.sort(this.elements);
        this.maximumDifference = Math.abs(this.elements[0]-this.elements[elements.length-1]);
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}