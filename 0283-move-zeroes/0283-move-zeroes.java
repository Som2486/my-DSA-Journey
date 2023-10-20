class Solution {
    public void moveZeroes(int[] nums) 
   {
        int temp = -1;

        for (int i = 0  ; i <= nums.length - 1 ; i++)
        {
            if (temp == -1 && nums[i] == 0)
            {
                temp = i;
            }else if (temp != -1 && nums[i] != 0){
                nums[temp] = nums[i];
                nums[i] = 0;
                i = temp;
                temp = -1;
            }
        }

    }
}