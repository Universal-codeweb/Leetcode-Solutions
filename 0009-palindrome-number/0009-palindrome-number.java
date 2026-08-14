class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int p=x;
        if(x<0) return false;
        while(x!=0){
            int n=x%10;
            r=r*10+n;
            x=x/10;
        }
        return r==p;
    }
}