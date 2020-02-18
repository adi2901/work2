import java.util.*;
class Character{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next().charAt(0);

for (int i=0;i<str.length();i++){

            ch[i] = str.charAt(i);
            int find = 0;
            for(int j=i+1;j<str.length();j++)
{
                if (str.charAt(i) == ch[j])  
                    find++;                
            }
            if (find == 1)  
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + Character(str.charAt(i));            
       
}
}
}