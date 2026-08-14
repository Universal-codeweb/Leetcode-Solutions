class Solution {
    public String reverseWords(String s) {
      String words[]=s.trim().split("\\s+");
      int i,j;
      for( i = 0,j=words.length-1; i<j; i++,j--){
        String temp= words[i];
        words[i]=words[j];
        words[j]=temp;
      }  
     return String.join(" ",words);
        
    }
}