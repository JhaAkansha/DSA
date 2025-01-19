/*
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.
*/
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int count = 0;

        if (n == 1) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            Map<Float, Integer> hash = new HashMap<>();
            int x1 = points[i][0];
            int y1 = points[i][1];

            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                if (x2 - x1 == 0) {
                    hash.put(Float.MAX_VALUE, hash.getOrDefault(Float.MAX_VALUE, 0) + 1);
                } else if (y2 - y1 == 0) {
                    hash.put(0f, hash.getOrDefault(0f, 0) + 1);
                } else {
                    float slope = (float) (y2 - y1) / (x2 - x1);
                    hash.put(slope, hash.getOrDefault(slope, 0) + 1);
                }
            }
            for (Map.Entry<Float, Integer> entry : hash.entrySet()) {
                count = Math.max(count, entry.getValue());
            }
        }

        return count + 1;
    }
}
