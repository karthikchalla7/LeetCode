class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        
        double prob[] = new double[n];
        prob[start_node]=1.0;
        for(int i=0;i<n-1;i++){
            boolean updated = false;
            for(int j=0;j<edges.length;j++){
                int u = edges[j][0];
                int v = edges[j][1];
                double sp = succProb[j];

                if(prob[u]*sp>prob[v]){
                    prob[v] = prob[u]*sp;
                    updated = true;
                }
                if(prob[v]*sp>prob[u]){
                    prob[u]=prob[v]*sp;
                    updated = true;
                }
            }
            if(!updated) break;
        }
        return prob[end_node];
    }
}