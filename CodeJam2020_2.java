/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Rupen Chitroda
 */

import java.util.*;

public class Solution {
    private static Scanner sc;
    static int tn = 1;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int t= sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String s  =sc.nextLine();
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();

            int num = 0;
            int brackets = 0;

            int first = Character.getNumericValue(chars[0]);
            num = first;
            brackets = first;

            for (int i=0; i<first; i++) {
                sb.append('(');
            }
            sb.append(first);

            for (int i=1; i<chars.length; i++) {
                int d = Character.getNumericValue(chars[i]);

                if(d == num) {
                    sb.append(d);
                }
                else if(d > num){
                    int diff = d-num;
                    for (int j=0; j<diff; j++) {
                        sb.append('(');
                        brackets++;
                    }
                    sb.append(d);
                } else {
                    int diff = num - d;
                    for (int j=0; j<diff; j++) {
                        sb.append(')');
                        brackets--;
                    }
                    sb.append(d);
                }

                    num = Character.getNumericValue(chars[i]);
                    
                }
                while(brackets-- > 0){
                    sb.append(')');
                }

                System.out.println("Case #" + (tn++) + ": " + sb.toString());
        }
    }
}
