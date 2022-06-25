import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Permutation{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=sc.nextLine();
        Map<Character,Integer> map1=convt(str);
        Map<Character,Integer> map2=convt(s); 
        int flag=1;
        for(Character c: map1.keySet())
        {
            int value1=0,value2;
            try{
                 value1= map1.get(c);
                 value2=map2.get(c); 
            }catch(Exception e){
                flag=0;
                break;
            }
                
            if(value1!=value2){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        }
        
    
        public static Map<Character,Integer> convt(String str){
            Map<Character,Integer> map= new HashMap<Character,Integer>();
        
        for(int i=0;i<str.length();i++)
        {
            Character c=str.charAt(i);
            try{
                Integer value=map.get(c);
                value++;
                map.put(c,value);
            }catch(Exception e){
                map.put(c,1);
            }
        }
            return map;
        }
}