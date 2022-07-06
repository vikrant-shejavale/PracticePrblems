class Solution {
    public boolean isPalindrome(int z) {
        String str= String.valueOf(z);
        StringBuilder sb=new StringBuilder(str);  
        sb=sb.reverse(); 
       // String temp=StringFormatter.reverseString(str);
        if(sb.toString().equals(str))
            return true;
        else
            return false;
    }
}
