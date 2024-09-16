class Solution {

    private int converToMin(String time){
        int hour = Integer.parseInt(time.substring(0,2));
        int min = Integer.parseInt(time.substring(3,5));

        return hour*60+min;
    }

    public int findMinDifference(List<String> timePoints) {
        int ans = Integer.MAX_VALUE;
        List<Integer> min = new ArrayList<>();

        for(String time:timePoints){
            min.add(converToMin(time));
        }

        Collections.sort(min);
        for(int i=1;i<min.size();i++){
            ans = Math.min(ans,min.get(i)-min.get(i-1));
        }

        return Math.min(ans, 1440 - (min.get(min.size() - 1) - min.get(0)));

    }
}