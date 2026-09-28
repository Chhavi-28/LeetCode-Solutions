class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=buildString(s);
        String t1=buildString(t);
        return s1.equals(t1);

    }
    private String buildString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}