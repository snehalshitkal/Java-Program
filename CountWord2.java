/*
//////////////////////////////////////////////////////////////////////
        Program: Count Number of Word:
        use reg expression : \\s+ : Remove multile white spaces
//////////////////////////////////////////////////////////////////////
*/
import java.util.*;
class CountWord2
{
    public static void main(String A[])
    {
            Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter the String:");
            String str = sobj.nextLine();

            str = str.trim();

            str = str.replaceAll("\\s+"," ");

            char Arr[] = str.toCharArray();
            int i = 0, iCount = 0;

            for(i = 0;i < Arr.length; i++)
            {
                if(Arr[i] == ' ')
                {
                    iCount++;
                }
            }
            System.out.println("Number of Word are "+(iCount+1));
        }
    }
