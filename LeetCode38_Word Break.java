/* Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code". */



import java.util.*;
public class Solution 
{
    public static boolean wordBreak(String s, Set<String> dict) 
    {
        if(dict.contains(s))
        {
            return true;
        }
        int len = s.length();
        
        boolean noTailWord = true;
        for(int i=len-1; i>0; i--)
        {
            if(dict.contains(s.substring(i)))
            {
                noTailWord = false;
            }
        }
        if(noTailWord)
        {
            return false;
        }
        
        for(int i=len-1; i>0; i--)
        {
            String part1 = s.substring(0, i);
            if(dict.contains(part1))
            {
                String part2 = s.substring(i);
                if(wordBreak(part2, dict))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
