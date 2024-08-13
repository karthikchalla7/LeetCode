class Solution {

    public void combinations(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> list){
        if(arr.length==idx){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return ;
        }

        if(arr[idx]<=target){
            list.add(arr[idx]);
            //pick
            combinations(idx,arr,target-arr[idx],ans,list);
            list.remove(list.size()-1);
        }
        //not pick
        combinations(idx+1,arr,target,ans,list);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}