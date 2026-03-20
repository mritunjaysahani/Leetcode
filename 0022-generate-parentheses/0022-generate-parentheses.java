class Solution {  
    public void  braces(String curr, int open, int close, int n, List<String> res){
                if (curr.length() == 2 * n) {
                  res.add(curr);
                  return;
             }
    if (open < n)  braces(curr + "(", open + 1, close, n, res);
    if (close < open)  braces(curr + ")", open, close + 1, n, res);
  }
  public List<String> generateParenthesis(int n) {
     List<String> res = new ArrayList<>();
    braces("", 0, 0, n, res);
        return res;
    }
}