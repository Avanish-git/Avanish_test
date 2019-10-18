import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestSubString2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        int result=smallestSubString(inputString);//method call
        System.out.println(result);
    }
    /*
    Method to find smallest Substring
    */
    private static int smallestSubString(String inputString)
    {
        char[] inputStringCharArray=inputString.toCharArray();//to convert string into charArray
        Set<Character> set=new LinkedHashSet<>();// set for unique character
        for(Character character:inputStringCharArray)
        {
           set.add(character);
        }
        return set.size();
    }
}
