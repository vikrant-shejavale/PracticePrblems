class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        // for (String i : strs)
        // {
        //     if (minLen< i.length())
        //     {
        //         minLen=i.length();
        //         smallest=i;
        //         }
        // }
        // if (minLen==0)
        //     return "";
       // System.out.println(smallest);
    String temp="";
        for (int j=1; j<= strs[0].length();j++)
        {
            temp=strs[0].substring(0,j);
            for (String i : strs)
            {
                if(i.startsWith(temp))
                    continue;
                else
                {
                    return strs[0].substring(0,j-1);

                }
            }
        }
        return strs[0];
        
    }
}
