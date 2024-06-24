class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for (String s : strs) {
            // Sort the string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // Use the sorted string as a key and append the original string to the list
            if (!anagrams.containsKey(sortedStr)) {
                anagrams.put(sortedStr, new ArrayList<>());
            }
            anagrams.get(sortedStr).add(s);
        }
        
        // Return the values of the map as a list of lists
        return new ArrayList<>(anagrams.values());
    }
}