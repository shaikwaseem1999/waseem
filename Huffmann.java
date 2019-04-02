void decode(String s, Node root) 
    {
        
     String s1="";
     Node c=root;
     for(int i=0;i<s.length();i++)
     {    char ch=s.charAt(i);
         if(ch=='1')
         {
            c=c.right;
         }
         else if(ch=='0')  c=c.left;
         if(c.right==null && c.left==null)
         {
               s1=s1+c.data;
               c=root;
         }

     }
     System.out.println(s1);
       
    }