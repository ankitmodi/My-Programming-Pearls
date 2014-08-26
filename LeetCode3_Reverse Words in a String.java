 //Given an input string, reverse the string word by word.

//For example,
//Given s = "the sky is blue",
//return "blue is sky the". 

public class Solution 
{
    public static String reverseWords(String s) 
    {
        s = s.trim();
        String[] parts = s.split(" ");
        String result ="";
        
        for(int i=0; i< parts.length; i++)
        {
            
            
            if(parts[i].trim().isEmpty())
            { continue; }
            
            if(i==0)
            {
                result = parts[i] + result ;
                parts[i]= parts[i].trim();
            }
            else
            {
                result = parts[i] + " " + result ;
                parts[i]= parts[i].trim();
            }
        }
        return result;
    }
}
