class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String str:s1.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        for(String str:s2.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        map.forEach((key,value)->{
            if(value==1) list.add(key);
        });

        return list.toArray(new String[list.size()]);
    }
}