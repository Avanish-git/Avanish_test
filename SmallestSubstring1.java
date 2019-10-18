import java.util.Scanner;

public class SmallestSubString1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        int result=smallestSubString(inputString);//method call
        System.out.println(result);
    }
    /*
    method to find smallest substring
    */
    private static int smallestSubString(String inputString)
    {
        int[] chracterFrequency=new int[26];//To store frequency of character
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
