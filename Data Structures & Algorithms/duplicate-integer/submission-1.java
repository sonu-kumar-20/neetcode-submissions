class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet <Integer> set = new HashSet<>();
     int n = nums.length;
     for(int i :nums){
        if(! set.add(i)){

            return true;
        }
    }
     
     return false;
    }
}
