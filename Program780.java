//Ip address program

import java.util.*;


class Program780
{

    public static int FormIP(int No1,int No2,int No3,int No4)
    {
        return 0;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter IP Address:");

        int No1 = sobj.nextInt();
        int No2 = sobj.nextInt();
        int No3 = sobj.nextInt();
        int No4 = sobj.nextInt();

       
        int iRet = FormIP(No1,No2,No3,No4);

        System.out.println("Formed number Contain IP address is :"+iRet);
    }
}