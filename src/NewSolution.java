public class NewSolution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            boolean ok = true;
            for (int j = 0; j < s.length(); ++j) {
                if (i != j && c == s.charAt(j)) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return i;
            }
        }
        return -1;
    }
}
