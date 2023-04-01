public class Lesson2 {

    public static void main(String[] args) {
        boolean result = isPrime(97);
        System.out.println("результат " + result);
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

//        public static boolean isPrime(int n){
//            if (n <= 1) {
//                return false;
//            }
//
//            if (n == 2 || n == 3) {
//                return true;
//            }
//
//            if (n % 2 == 0 || n % 3 == 0) {
//                return false;
//            }
//
//            for (int i = 5; i <= Math.sqrt(n); i += 2) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//
//            return true;
//        }


    }






