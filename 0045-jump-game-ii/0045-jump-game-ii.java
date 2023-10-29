class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;

        }
        int count=0;
        int max=0;
        int current=0;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i== current){
                count++;
                current=max;
            }
        }
        return count;
    }
}