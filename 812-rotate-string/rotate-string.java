class Solution {
    public boolean rotateString(String s, String goal) {
        String ans=s+s;
        if(s.length()!=goal.length())return false;
        return ans.contains(goal);
        
    }
}