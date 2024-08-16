class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int global_min = arrays.get(0).get(0);
        int global_max = arrays.get(0).get(arrays.get(0).size()-1);
        int max_dist = Integer.MIN_VALUE;

        for(int i=1;i<arrays.size();i++){
            List<Integer> list = arrays.get(i);
            int currentmin = list.get(0);
            int currentmax = list.get(list.size()-1);

            int d1 = Math.abs(global_max - currentmin);
            int d2 = Math.abs(currentmax - global_min);

            max_dist = Math.max(max_dist,Math.max(d1,d2));

            global_min = Math.min(global_min,currentmin);
            global_max = Math.max(global_max,currentmax);
        }
        return max_dist;
    }
}