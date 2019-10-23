import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n>0)
        {

            String s = scanner.nextLine();

            char[] charArray = s.toCharArray();
            for (int i =0;i<s.length();i = i+2)
            {
                System.out.print(charArray[i]);
            }
            System.out.print(" ");
            for (int i =1;i<s.length();i = i+2)
            {
                System.out.print(charArray[i]);
            }
            System.out.println();
            n--;
        }

    }
}

