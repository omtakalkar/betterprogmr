
public class BetterProgrammerTask {

    public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */

          int sum=0;
          String[] temp;
          temp=s.split("");
          for(int i=0; i<temp.length();i++)
         {
              if(isNumeric(String temp[i]))
             sum=sum+Integer.parseInt(temp[i]);
          }
          System.out.println("sum :" + sum);
    
          
    }

         public static void main(String[] args)
        {
               BetterProgrammerTask.getSumOfNumbers("12 some text 3  7");
         }
}
