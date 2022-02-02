import java.util.Scanner;

class Main {
public static int nextPrime(int n){

    n++;
    for (int i = 2; i < n; i++) {
        if(n%i == 0){
                    n++;
                    i=2;
                    }
        else{
            continue;
            }
            }
        return n;
}

public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nextPrime(n);
            System.out.println(ans);
        }
        scn.close();
    }
}
