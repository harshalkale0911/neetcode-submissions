class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int left = 0 ;
        int max_freq = 0;
        int result = 0;

        for(int right =0;right<s.length(); right++){
            // add and check freq for each character 
            int index = s.charAt(right) - 'A';
            freq[index]++;

            // max freq in curr window;
            max_freq = Math.max(max_freq, freq[index]);

            // no of replacement needs to do.
            int wid_length = right-left+1;
            int replacement = wid_length - max_freq;

            while(replacement > k){
            freq[s.charAt(left) - 'A']--;
            left++;
            
             wid_length = right-left+1;
             replacement = wid_length - max_freq;
            
            }
            result = Math.max(result,wid_length);
        }
        return result;
    }
}
