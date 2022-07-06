class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startIndex=0;
        int endIndex=0;
        int longest=0;
        if (s.isEmpty())
            return 0;
        if (s.length()==1)
            return 1;
        //String temp=Character.toString(s.charAt(0));
        for (int i=0;i<s.length();i++)
        {
            //for (int j=i+1;j<=s.length();j++)
            for (int j=s.length();j>i;j--)
            {
                String sub=s.substring(i,j);
                //System.out.print(sub);
                boolean flag=true;
                if(longest<sub.length())
                {
                    for(int x=0;x<sub.length();x++)
                    {
                        StringBuilder temp=new StringBuilder(sub);
                        char ch=temp.charAt(x);
                        if(new String(temp.deleteCharAt(x)).contains(Character.toString(ch)))
                        {
                            flag=false;
                            break;
                        }

                    }
                       if(flag )
                       {
                            longest=sub.length();
                       }
                }
            }
        }
        
//         for (int i=0; i<s.length();i++)
//         {
//             if(temp.contains(Character.toString(s.charAt(i))))
//             {
//                if(longest< (endIndex-startIndex))
//                {
//                    longest=endIndex-startIndex;
//                }
//                 if(temp.length()>1)
//                 {
//                     startIndex=temp.indexOf(s.charAt(i))+1;
//                     endIndex=i;
//                     temp=temp.substring(startIndex);
//                 }
//             }
//             else{
//                  temp=temp+Character.toString(s.charAt(i));
//                 endIndex++;
//                 if(longest< (endIndex-startIndex))
//                     {
//                         longest=endIndex-startIndex;
//                     }
                
//             }
            
//         }
        // if(longest<2)
        // {
        //     return longest;
        // }
       // System.out.println(st)
        return longest;
        
    }
}
