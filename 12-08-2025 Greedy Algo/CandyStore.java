// geeks for geeks
// Shop in Candy Store
class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        // step 1 - sort the array in ascending order
        Arrays.sort(prices);
        
        // step 2 - minimum cost
        int mincost = 0;
        int i = 0;
        int j = prices.length-1;
        while(i<=j){
            mincost += prices[i]; // buy cheapest
            i++;
            j-=k; // get k expensive candies for free
        }
        
         // step 3  Maximum cost 
        int maxcost = 0;
        i = prices.length - 1; // expensive end
        j = 0;
        while (i >= j) {
            maxcost += prices[i]; // buy most expensive
            i--;
            j += k; // get k cheapest candies for free
        }
        ans.add(mincost);
        ans.add(maxcost);
        return ans;
        
    }
}
