class Solution {
    public int maximumWealth(int[][] accounts) {
        int totalWealth = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int total = 0;
            for(int j=0; j<accounts[i].length; j++){
                total+=accounts[i][j];
            }
            totalWealth = Math.max(totalWealth, total);
        }
        return totalWealth;
    }
}