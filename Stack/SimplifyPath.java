/*
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.
*/
class Solution {
    public String simplifyPath(String path) {
        String[] elements = path.split("/");
        Stack<String> st = new Stack<>();
        for (String e : elements) {
            if (e.equals("") || e.equals(".")) {
                continue;
            }
            if(e.equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            }
            else {
                st.push(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
