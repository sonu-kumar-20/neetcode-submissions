class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet <Integer> set = new HashSet<>();
     int n = nums.length;
     for(int i :nums){
        set.add(i);
     }
     if(set.size() == n){
        return false;
     }
     return true;
    }
}
