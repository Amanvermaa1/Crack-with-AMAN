class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0 ; int totalFuel = 0 ;
        int n = gas.length;
        for(int i = 0 ; i<n ;i++){
            totalFuel+=gas[i];
            totalCost+=cost[i];
        }
        if(totalFuel<totalCost){
            return -1 ;
        }
        int si = 0 ;
        int fuel = 0 ;
        for(int i = 0 ; i<n;i++){
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                si=i+1;
                fuel = 0; 
            }
        }
    return si ;
    }
}