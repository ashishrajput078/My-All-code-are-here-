class moye_moye {
    public boolean isHappy(int n) {
        while(n/10!=0){
            int a=0;
            while(n!=0){
                a+=Math.pow(n%10,2);
                n=n/10;
            }
            n=a;
        }
        if(n==1 || n==7){
            return true;
        }
        return false;
    }
}