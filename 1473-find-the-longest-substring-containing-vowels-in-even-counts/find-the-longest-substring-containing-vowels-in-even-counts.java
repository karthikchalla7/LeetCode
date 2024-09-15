import java.util.HashMap;

class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        firstOccurrence.put(0, -1);

        int bitmask = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'a':
                    bitmask ^= 1 << 0;
                    break;
                case 'e':
                    bitmask ^= 1 << 1;
                    break;
                case 'i':
                    bitmask ^= 1 << 2;
                    break;
                case 'o':
                    bitmask ^= 1 << 3;
                    break;
                case 'u':
                    bitmask ^= 1 << 4;
                    break;
            }
            
            if (firstOccurrence.containsKey(bitmask)) {
                int prevIndex = firstOccurrence.get(bitmask);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                firstOccurrence.put(bitmask, i);
            }
        }

        return maxLength;
    }
}
