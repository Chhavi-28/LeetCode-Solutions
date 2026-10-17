class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        /* time complexity-O(m+n)
        int n=nums1.length;
        int m=nums2.length;
        int[] nums=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m&&k<=nums.length/2){
            if(nums1[i]<nums2[j]){
                nums[k]=nums1[i];
                i++;
                k++;

            }
            else{
                nums[k]=nums2[j];
                j++;
                k++;

            }
            
        }
        while(i<n&& k<=nums.length/2){
                nums[k]=nums1[i];
                i++;
                k++;
        }
        while(j<m&&k<=nums.length/2){
                nums[k]=nums2[j];
                j++;
                k++;
        }
        int n3=nums.length;
        double median;
        if(n3%2==0){
            int mid=n3/2;
            median=(nums[mid]+nums[mid-1])/2.0;
        }
        else{
            int mid = n3/2;

            median=nums[mid];
        }
        return median;
        */
        /**time complexity -O(logm+n) */
        if(nums2.length<nums1.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int l=0,h=nums1.length;
        while(l<=h){
            int m1=(l+h)/2;
            int m2=((nums1.length+nums2.length+1)/2)-m1;
            int l1=(m1==0)?Integer.MIN_VALUE:nums1[m1-1];
            int r1=(m1==nums1.length)?Integer.MAX_VALUE:nums1[m1];
            int l2=(m2==0)?Integer.MIN_VALUE:nums2[m2-1];
            int r2=(m2==nums2.length)?Integer.MAX_VALUE:nums2[m2];
            if(l1 <= r2 && l2 <= r1){

               if((nums1.length+nums2.length)%2==0){
                return (Integer.max(l1,l2)+Integer.min(r1,r2))/2.0;
               }
               else{
                return Integer.max(l1,l2);
               }   
            
            }
            else if(l1>r2){
                h=m1-1;
               
            }
            else{
                l=m1+1;
                
            }
        }
        return 0.0f;
        
                

        
    }
}