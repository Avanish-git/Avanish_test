import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestSubString2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        int result=smallestSubString(inputString);
        System.out.println(result);
    }
    private static int smallestSubString(String inputString)
    {
        char[] inputStringCharArray=inputString.toCharArray();
        Set<Character> set=new LinkedHashSet<>();
        for(Character character:inputStringCharArray)
        {
           set.add(character);
        }
        return set.size();
    }
}
