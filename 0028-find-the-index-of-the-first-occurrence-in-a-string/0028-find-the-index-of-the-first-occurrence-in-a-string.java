class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1; // Handle null inputs
        }
        
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            boolean found = true;
            for (int j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i; // Found the needle at index i
            }
        }
        
        return -1; // Needle not found
    }
}