import java.util.Scanner;

public class SmallestSubstring1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        int result=smallestSubString(inputString);
        System.out.println(result);
    }
    private static int smallestSubString(String inputString)
    {
        int[] chracterFrequency=new int[26];
        for(int i=0;i<inputString.length();i++)
        {
            char stringCharacter=inputString.charAt(i);
            chracterFrequency[stringCharacter-97]++;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
           if(chracterFrequency[i]>=1)
           {
               count++;
           }
        }
        return count;
    }
}
