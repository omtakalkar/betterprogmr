
public class BetterProgrammerTask {

    public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */

          String[] stringArray = s.split(" ");
    int sum=0;
    int temp=0;
    for(int i=0;i<stringArray.length;i++){
        try{
            
            temp = Integer.parseInt(stringArray[i]);
            sum += temp;
        }catch(Exception e){
            
        }
    }
    return sum;
}
          
    

         public static void main(String[] args)
        {
        	
        	 BetterProgrammerTask btr = new BetterProgrammerTask();
        	 btr.getSumOfNumbers("12 some text 3  7");
             
         }
}
