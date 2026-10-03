class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        long mul = 1;
        boolean flag = false;
        int zero =0;
        for(int i : nums){
            if(i != 0){
                 mul *= i;
            }else{
                zero++;
                flag = true;
            }
           
        }
        int j =0;
        if(zero > 1){
            for(int i =0;i<nums.length;i++){
                nums[i] = 0;
            }
        }else{

       
        for(int i : nums ){
           if(flag && i != 0){
            nums[j] = 0; 

           } else if (i == 0 && flag) {
             nums[j]=(int)  mul;
           }else{
                nums[j]= (int) mul/i;

           }
           j++;
        } }
        return nums;
    }
}  
