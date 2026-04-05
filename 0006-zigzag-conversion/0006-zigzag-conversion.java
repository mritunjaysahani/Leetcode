class Solution {
    public String convert(String s, int numRows) {
      int n = s.length();
      if (numRows == 1 || n <= numRows) return s;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int inc = 2 * (numRows - 1);
            for (int j = i; j < n; j += inc) {
                ans.append(s.charAt(j));
                int diag = j + inc - 2 * i;
                if (i > 0 && i < numRows - 1 && diag < n) {
                    ans.append(s.charAt(diag));
                }
            }
        }

        return ans.toString();
    }
}