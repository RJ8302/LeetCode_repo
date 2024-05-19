class Solution{
    public int findMaxConsecutiveOnes(int[] nums) {
        int cosCount = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                cosCount++;
                if(cosCount > max){
                    max = cosCount;
                }
            }else{
                cosCount = 0;
            }
        }
        return max;
    }
}