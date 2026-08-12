class Solution {
    public String toLowerCase(String s) {

   String newString = "";

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                char lowerCaseChar = (char) (ch + 32);
                newString = newString + lowerCaseChar;

            }
            else 
             newString = newString + s.charAt(i);
        }
        return newString;
    }
}