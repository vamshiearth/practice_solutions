class Solution{
    static double switchCase(int choice, List<Double> arr){
        
        switch(choice){
            case 1:
                double res = Math.PI  * arr.get(0)*arr.get(0);
                return res;
                
            case 2:
                double res1 = arr.get(0)*arr.get(1);
                return res1;    
        }
        return 1.0;
    }
}