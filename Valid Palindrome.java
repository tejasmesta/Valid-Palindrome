class Solution {
    public boolean isPalindrome(String s) {
        String n = s.toLowerCase().strip().replaceAll("[^a-z0-9]",""); 
        
        int h = n.length()-1;
        
        int l = 0;
        
        while(l<h)
        {
            if(n.charAt(l)!=n.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        
        return true;
    }
}
