class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<Character>();
        int len=s.length();
        int r=0,ans=0;
        for(int l=0;l<len;l++){
            if(l==0)set.add(s.charAt(l));
            if(l!=0){
                set.remove(s.charAt(l-1));
            }
            while(r+1<len&&!set.contains(s.charAt(r+1))){
                r++;
                set.add(s.charAt(r));
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}