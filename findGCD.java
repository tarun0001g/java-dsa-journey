

class findGCD {
    public static void main(String[] args) {
        
        // gcd(a,b) = gcd(b, a%b), till b=0 then a is answer.

        int a = 18;
        int b = 12;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}