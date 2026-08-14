class Solution {
    public int reverse(int x) {
        int r=0;
        while(x!=0){
            int n=x%10;
            int newr=r*10+n;
            x=x/10;
        if((newr-n)/10!=r){
            return 0;
        }
        r=newr;
        }
    return r; 
    }
}