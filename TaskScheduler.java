TC: O(n)
SC: O(n)

Runtime: 5 ms, faster than 64.58% of Java online submissions for Task Scheduler.
Memory Usage: 43 MB, less than 5.88% of Java online submissions for Task Scheduler.

Approach: Take the count of all tasks and sort the array.For each interval of size n, reduce the count of chars starting from highest 
to lowest.Repeat till there are no more counts left for any character.

class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int [] count = new int[26];
        for(char ch : tasks){
            count[ch-'A']++;
        }
        Arrays.sort(count);
        int interval = 0;
        int time = 0;
        while(count[25] > 0){
            interval =0;
            while(interval <= n && count[25]>0){
            if(interval < 26 && count[25-interval] > 0){
                count[25-interval]--;
            } 
            interval++;
            time++;
            }
            Arrays.sort(count); // O(1)  complexity
            
        }
        return time;
    }
}
