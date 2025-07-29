class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        
        for(int i = arr.length-1;i>=0;i--){
            // remove all the elements smaller or equal to arr[i]
            while(!st.isEmpty()&& st.peek()<= arr[i]){
                st.pop();
            }
             // If stack is empty, no greater element
            if (st.isEmpty()) {
                result.add(-1);
            } else {
                result.add(st.peek());
            }
            // push current element
            st.push(arr[i]);
        }
        // Reverse result because we filled it from right to left
        Collections.reverse(result);
        return result;
    }
}
