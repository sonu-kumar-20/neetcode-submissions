class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(String str : strs){
            char [] keywords = str.toCharArray();
            Arrays.sort(keywords);
            String key = new String(keywords);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);

        }
     return new ArrayList<>(map.values());
    }
}
