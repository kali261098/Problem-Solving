import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Unique {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
             Character key = str.charAt(i);
            try{
                Integer value = map.get(key);
                value=value+1;
                map.put(key,value);
            } catch(Exception ex){
                map.put(key,1);
            }
        }
        int flag=1;
        for(Character key : map.keySet()){
            Integer value = map.get(key);
            if(value>1){
                flag=0;
                break;
            }
        }
        
        if(flag==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}