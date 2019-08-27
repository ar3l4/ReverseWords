public class ReverseWords{

 public static String reverseWords(String str){
     String strArray[] = str.split(" ");
     String str2 = "";
     for(int i = 0; i < strArray.length; i++){
       if(i==strArray.length-1)
         str2 = strArray[i] + str2;
       else
         str2 = " " + strArray[i] + str2;
     }
     return str2;
   }
}
