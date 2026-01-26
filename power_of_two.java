class power_of_two {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        power_of_two obj = new power_of_two();
        int n = 1;   // yahan number change karke test karo
         System.out.println(obj.isPowerOfTwo(n));
    }
}
