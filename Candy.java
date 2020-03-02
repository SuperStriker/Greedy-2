


class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        
        int [] result = new int[n];
        Arrays.fill(result,1);
        
        //1) left neighbour
        
        for(int i=1; i< ratings.length; i++){
            if(ratings[i]> ratings[i-1]){
                result[i] = result[i-1]+1;
            }
        }
        //2) right neighbour
        
        for(int i=ratings.length-2; i>=0; i--){
            if(ratings[i]> ratings[i+1]){
                result[i] = Math.max(result[i+1]+1,result[i]);
            }
        }
        
        // calculate sum
        int sum =0;
        for(int x=0; x< ratings.length; x++){
            sum+= result[x];
        }
        return sum;
    }
}
