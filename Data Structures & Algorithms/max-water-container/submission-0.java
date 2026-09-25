class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int max_water = 0;

        while(l<r){
            int width = r-l;
            int high = Math.min(heights[l],heights[r]);
            int water = width*high;
            max_water = Math.max(water,max_water);
 
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
         
            return max_water;
    }
}
