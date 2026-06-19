class Solution {
    public int wateringPlants(int[] plants, int cap) {
        int count = 0; 
        int water = cap ;
        for(int i = 0 ; i<plants.length ; i++){
            if(plants[i]> water){
                count += (2*i);
                water = cap ;
            }
           
                count++ ;
                water -=plants[i];
            
        }
        return count ;
    }
}