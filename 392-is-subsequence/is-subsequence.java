class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev=-1;
        for(int i=0;i<s.length();i++){
            boolean found=false;
            for(int j=prev+1;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    prev=j;
                    found=true;
                    break;
                }
            }
            if(!found)return false;
        }
        return true;
        
    }
}