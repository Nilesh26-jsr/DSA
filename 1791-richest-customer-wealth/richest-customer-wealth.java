class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestWealth = 0;
        for(int i=0; i<accounts.length; i++){
            int currentWealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                currentWealth += accounts[i] [j];
            }
            if(currentWealth > richestWealth){
                richestWealth = currentWealth;
            }
        }
        return richestWealth;
    }
}