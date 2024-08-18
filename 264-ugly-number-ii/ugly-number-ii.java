class Solution {
    public int nthUglyNumber(int n) {
        int[] factors = {2,3,5};
    PriorityQueue<Long> pq = new PriorityQueue<>();
       HashSet<Long> set = new HashSet<>(); 
       pq.offer(1L);
        set.add(1L);
        long temp = 0;
        for(int i=1;i<=n;i++){
            temp = pq.poll();
            for(int factor:factors){
                if(!set.contains(factor*temp)){
                    pq.offer(temp*factor);
                    set.add(temp*factor);
            }
            }
        }
        return (int)temp;
    }
}