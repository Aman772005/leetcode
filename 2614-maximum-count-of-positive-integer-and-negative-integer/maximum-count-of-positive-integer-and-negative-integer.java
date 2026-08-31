class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length ;
        int lo1 = 0 , hi1 = n-1;
        while(lo1<=hi1){
            int mid = lo1+ (hi1-lo1)/2 ;
            if(nums[mid]<=0) lo1 = mid + 1;
            else hi1 = mid -1 ;
        }
       int CountPositive = n - lo1 ;

        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(nums[mid]>=0) hi = mid-1 ;
            else lo = mid + 1;
        }
       int CountNegative = hi+1 ;

       return Math.max(CountNegative , CountPositive);
    }
}