package P5;

public class Faktorial {
    int faktorialBF04(int n){
        int fakto = 1;
            for (int i = 1; i <= n; i++) {
                fakto = fakto * i;
            }
            return fakto;
    }
    int faktorialDC04 (int n){
        if (n==1) {
            return 1;
        }else {
            int fakto = n * faktorialDC04(n -  1);
            return fakto;
        }
    }
}
