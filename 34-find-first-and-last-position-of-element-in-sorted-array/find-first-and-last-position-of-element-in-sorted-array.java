class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0,hi = nums.length-1,idx1 = -1,idx2=-1 ;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]<target) lo = mid + 1;
            else if(nums[mid]>target) hi = mid-1;
            else{
                idx1 = mid ;
                hi = mid-1;
            }
        }

        lo = 0 ; hi = nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]<target) lo = mid + 1;
            else if(nums[mid]>target) hi = mid-1;
            else{
                idx2 = mid ;
                lo = mid+1;
            }
        }
        
        return new int[]{idx1,idx2};
    }
}