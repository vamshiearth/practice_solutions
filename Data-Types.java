class Solution {
    static int dataTypeSize(String str) {
        if(str.equals("Character") ){
            return 1;
        }
        
        if(str.equals("Integer")){
            return 4;
        }
        
        if(str.equals("Long")){
            return 8;
        }
        
        if(str.equals("Float")){
            return 4;
        }
        
        if(str.equals("Double")){
            return 8;
        }
    
        return -1;
    }
    
}