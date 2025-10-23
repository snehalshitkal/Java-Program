import java.util.*;
class Collection3
{
    public static void main(String A[])
    {
        float Arr[] = {11.4f,51.4f,21.5f,101.5f,75.6f,95.4f};

        System.out.println(Arr);

        System.out.println("Data traversal using for-each");
        for(float no:Arr)
        {
            System.out.println(no);
        }

        Arrays.sort(Arr);

        System.out.println("Data traversal using for each after sorting:");
        for(float no:Arr)
        {
            System.out.println(no);
        }

        int iRet = 0;
        iRet = Arrays.binarySearch(Arr,21);
        System.out.println("Return value of binary search is :"+iRet);

        iRet = Arrays.binarySearch(Arr,121);
        if(iRet >= 0)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }

        
    }
}