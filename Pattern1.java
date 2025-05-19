import java.util.*;

class Paterndisplay
{
    int icnt = 0;
    public void Display(int iNo)
    {
        for (icnt = 1; icnt<=iNo ; icnt++)
        {
            System.out.print("*\t");
        }
    }
}
class Pattern1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Frequency:");
        iValue =sobj.nextInt();

        Paterndisplay pobj = new Paterndisplay();

        pobj.Display(iValue);

    }
}