class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr[0].length();i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j].length()<=i||arr[0].charAt(i)!=arr[j].charAt(i)){
                    return ans.toString();
                }
            }
            ans.append(arr[0].charAt(i));
        }
        return ans.toString();
    }
}
