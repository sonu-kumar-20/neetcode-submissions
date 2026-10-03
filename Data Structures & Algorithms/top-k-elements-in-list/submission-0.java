class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        
        for(int i : nums){

            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }

        int[] ans = new int[k];
       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

       list.sort((a,b) -> b.getValue() - a.getValue());

       for(int i =0;i<k;i++){
        ans[i] = list.get(i).getKey();
       }
        return ans;
    }
}
