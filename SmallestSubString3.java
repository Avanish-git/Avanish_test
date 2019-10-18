import java.util.Scanner;

public class SmallestSubString3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        int result=smallestSubString(inputString);
        System.out.println(result);
    }
    private static int smallestSubString(String inputString)
    {
        int count=0;
        String checkDuplicate="";
        for(int i=0;i<inputString.length();i++)
        {
            char character=inputString.charAt(i);
            if(!checkDuplicate.contains(Character.toString(character))) {
                checkDuplicate =checkDuplicate+character;
                count++;
            }
        }
        return count;
    }
}
