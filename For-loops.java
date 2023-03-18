class Geeks {
    static void isPrime(int n) {
        
        if(n==1){
            System.out.println("No");
            return;
        }
        
        Boolean bool = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                bool = false;
            }
        }
        
        if(bool){
            System.out.println("Yes");    
        }else{
            System.out.println("No");
        }
        
    }
}