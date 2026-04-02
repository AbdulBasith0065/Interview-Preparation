class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        boolean id=false;
        int t=0;
        int f=0;
        for(int i=0;i<s.length();i++){
            if(s.length()%2==1) return false;
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
                f++;
            }
            else{
                if (st.isEmpty()) return false;
                t++;
                if(st.peek()=='('&s.charAt(i)==')'||st.peek()=='['&s.charAt(i)==']'||st.peek()=='{'&s.charAt(i)=='}'){
                    st.pop();
                    id=true;

                }
                else{
                    st.push(s.charAt(i));
                    id=false;
                }
            }
        }
        if(t==f){
            return id;
        }
        else return false;
        
    }
}