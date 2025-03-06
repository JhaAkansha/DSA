/*
You are given an array nums of n integers and two integers k and x.
The x-sum of an array is calculated by the following procedure:
    1. Count the occurrences of all elements in the array.
    2. Keep only the occurrences of the top x most frequent elements. If two elements have the same number of occurrences, the element with the bigger value is considered more frequent.
    3. Calculate the sum of the resulting array.
*/
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int res[] = new int[n-k+1];
        for (int i = 0; i < res.length; i++) {
            int sum = 0;
            Set<Integer> set = new HashSet<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i+k; j++) {
                sum += nums[j];
                set.add(nums[j]);
                map.put(nums[j], map.getOrDefault(nums[j], 0) +1);
            }
            if (set.size() < x) res[i] = sum;
            else {
                PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
				if(map.get(a) == map.get(b)) return b-a;
				return map.get(b)-map.get(a);
			    });
			    for(int ele : set) pq.add(ele);
			    int ct = x;
			    while(ct-- > 0) {
				    int top = pq.remove();
				    res[i] += (top*map.get(top));
                }
            }
        }
    return res;
    }
}
