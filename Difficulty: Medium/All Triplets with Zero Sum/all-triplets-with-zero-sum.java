class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int target = -(arr[i] + arr[j]);

                if (map.containsKey(target)) {
                    for (int k : map.get(target)) {
                        if (k > j) {
                            res.add(Arrays.asList(i, j, k));
                        }
                    }
                }
            }
        }
        return res;
    }
}