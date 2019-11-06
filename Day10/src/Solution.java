import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> list = new ArrayList<Integer>();
        while (n>0)
        {

            int rem = n%2;
            n = n/2;
            list.add(rem);

        }
        int maxcount = Integer.MIN_VALUE;
        int c = 1;
        for (int i= 0; i<list.size()-1;i++)
        {
            if (list.get(i)==1 && list.get(i+1)== 1)
            {
                c++;
                if (maxcount<c)
                {
                    maxcount  = c;
                }
            }
            else
                c = 1;

        }
        if (maxcount>1)
            System.out.println(maxcount);
        else
            System.out.println(1);
        scanner.close();
    }
}
