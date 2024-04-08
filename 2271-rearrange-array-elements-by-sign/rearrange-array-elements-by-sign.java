class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int num:nums){
            if(num>=0) pos.add(num);
            else neg.add(num);
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<pos.size() && j<neg.size()){
            nums[k++]=pos.get(i++);
            nums[k++]=neg.get(j++);
        }

        while(i<pos.size()) nums[k++]=pos.get(i++);
        while(j<neg.size()) nums[k++]=neg.get(j++);
        return nums;
    }
}