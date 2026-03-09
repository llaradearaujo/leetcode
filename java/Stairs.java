/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/

class Stairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        int a = 1;  // f(n-2)
        int b = 2;  // f(n-1)
        
        for (int i = 3; i <= n; i++) {
            
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
    


