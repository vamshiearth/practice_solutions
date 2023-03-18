class Solution{
    static String compareNM(int n,int m){
        
        if(n<m){
            return "lesser";
        }
        if(n>m){
            return "greater";
        }
        if(n==m){
            return "equal";
        }
        return "x";
    }
}