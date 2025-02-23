class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((int)target<(int)letters[mid]){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return letters[left%letters.length];
    }
}