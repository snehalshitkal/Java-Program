/*
//////////////////////////////////////////////////////////////
    Program: Replace by multiple white spaces using inbuild function

    use Regular Expression: \\s+

/////////////////////////////////////////////////////////////
*/

import java.util.*;
class ReplaceMultipleWhiteSpace
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+","");

        System.out.println(str);
    }
}