public class Lesson2_1 {
    public static void main(String[] args) {
        //1. константи O(1)
        //2.Лінійна складність O(n)


//        for(int i = 0; i<n;i++){
//            System.out.println("hello world ");//+1.
//        }

        //3. квадратна складність O(n^2)
        for(int i = 0; i<n;i++){
            System.out.println("outputfromoutside "+i);
            for(int j = 0; j<n;j++){
                System.out.println("output "+i);
            }
        }
        //n+n=2n            O(2n)
        //O(n^2+n) -> O(n^2)
        for(int i = 0; i<n;i++){
            System.out.println("outputfromoutside "+i);
        }
        for(int j = 0; j<n;j++){
            System.out.println("output ");
        }


    }
}
