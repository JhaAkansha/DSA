/*
A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
*/
class Solution {
    private static boolean CanShipCargo(int [] weights, int max, int days){
        int count_weight=0;
        int count_days=1;
        for(int i=0;i< weights.length;i++){
            if(count_weight+ weights[i]> max)
            {
                count_days++;
                count_weight= weights[i];
            }
            else count_weight+= weights[i];
        }
    System.out.println(count_weight+" "+max+" "+ count_days);
        return count_days<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i< weights.length;i++){
            max= Math.max(weights[i], max);
            sum+= weights[i];
        }
        int lo= max;
        int hi= sum;
        if(days== weights.length) return max;
        int ans = -1;
        while(lo<= hi){
            int mid= lo+(hi-lo)/2;
           if(CanShipCargo(weights, mid, days)){
             ans= mid;
             hi= mid-1;
           } else lo=mid+1;
        }
        return ans;
    }
}
