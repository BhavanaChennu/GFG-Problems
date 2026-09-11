class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap <String , List<String>> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length; i++){
            char[] ch = arr[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(arr[i]);
        }
         ArrayList<ArrayList<String>> res = new ArrayList<>();
         for(List<String> group : map.values()){
             res.add(new ArrayList<>(group));
         }
        return res;
    }
}