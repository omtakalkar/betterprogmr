
public class BetterProgrammerTask 
{

    public static String reverseWords(String r)
    {
        /*
          Assume that the parameter String can only contain spaces and alphanumeric characters.
          Please implement this method to
          reverse each word in the original String while maintaining the word order.
          For example:
          parameter: "Hello world", result: "olleH dlrow"
         */

       
    String r="";
    int len=word.length();
    for(int i=0;i<len;i++)
    {
       r=word.charAt(i)+r; 
    }
    return r;   
}

public static void main(String args[])throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = br.readLine()+' ';
        String rev="",s1="";
    int l=s.length();

    for(int i=0;i<l;i++)
    {
        if (s.charAt(i)!=' ')
        {
        rev=rev+slcharAt(i);

        }
        else
        {
        rev=reverseWords(rev);
        s1=s1+rev+" ";
        rev="";



    }
}
 System.out.println(s1);
}
}
