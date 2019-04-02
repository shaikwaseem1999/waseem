import java.io.*;
import java.util.*;

 class Solution 
{
    static Scanner sc=new Scanner(System.in);
    static void exec_query(int t,Stack s1,Stack s2)
    {    ArrayList<Integer> al=new ArrayList<Integer>();
        if(t==1)
        {
             int element = sc.nextInt();
             s1.push(element);
        }
        else if(t==2)
        {
            if(s2.isEmpty())
            {
                while(!s1.isEmpty())
                {
                   s2.push(s1.pop());
                }
            }
            s2.pop();
        }
        else if(t==3)
        {
           if(s2.isEmpty())
            {
                while(!s1.isEmpty())
                {
                   s2.push(s1.pop());
                }
            }
            al.add((Integer)(s2.peek()));
        }
        for(Integer i:al){
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        
        int q=sc.nextInt();
        Stack<Integer> first_stack=new Stack<Integer>();
        Stack<Integer> second_stack=new Stack<Integer>();
        for(int i=0;i<q;i++)
        {
              int type=sc.nextInt();
              exec_query(type, first_stack, second_stack);
        }
    }
}

