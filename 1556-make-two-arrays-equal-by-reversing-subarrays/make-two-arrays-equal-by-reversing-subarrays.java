class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        if(arr.length!=target.length) return false;
        int[] map = new int[1001];
        int n = target.length;
        for(int i=0;i<n;i++){
            map[target[i]]++;
            map[arr[i]]--;
        }

        for(int i=0;i<n;i++){
            if(map[arr[i]]!=0 || map[target[i]]!=0)
            return false;
        }
        return true;
    }
}