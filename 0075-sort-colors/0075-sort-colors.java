class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0;int cnt1=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                cnt0++;
            }
            else if(nums[i]==1){
                cnt1++;
            }
        }
        for (int a=0;a<cnt0;a++){
            nums[a]=0;
        }
        for (int b=cnt0;b<cnt0+cnt1;b++){
            nums[b]=1;
        }
        for(int c=cnt0+cnt1;c<nums.length;c++){
            nums[c]=2;
        }
    }
}