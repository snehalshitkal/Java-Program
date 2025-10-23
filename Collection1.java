import java.util.*;
class Collection1
{
    public static void main(String A[])
    {
        int Arr[] = {11,51,21,101,75,95};
        System.out.println(Arr);

        for(int icnt = 0;icnt < Arr.length;icnt++)
        {
            System.out.println(Arr[icnt]);
        }
        System.out.println("Data traversal using for each");
        for(int no:Arr)
        {
            System.out.println(no);
        }
    }
}