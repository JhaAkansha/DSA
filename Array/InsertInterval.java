/*
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
Return intervals after the insertion.
Note that you don't need to modify intervals in-place. You can make a new array and return it.
*/
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> interval = new ArrayList<>(Arrays.asList(intervals));
        interval.add(newInterval);
        Collections.sort(interval, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int[] curr = interval.get(0);
        for (int i = 1; i < interval.size(); i++) {
            int[] intv = interval.get(i);
            if (curr[1] >= intv[0]) {
                curr[1] = Math.max(curr[1], intv[1]);
            }
            else {
                res.add(curr);
                curr = intv;
            }
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);
    }
}
