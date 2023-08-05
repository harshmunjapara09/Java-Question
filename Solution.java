import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

    public static boolean checkIfPangram(String sentence) {
        int n = sentence.length();

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : sentence.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        if (26 <= n) {
            if (map.size()==26){
                return true;
            }
        }
        return false;
    }
}