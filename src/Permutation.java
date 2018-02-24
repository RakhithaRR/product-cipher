
public class Permutation {

    public String encryptWithPerm(String inputString, String secretKey){

        int deficit;
        int n = secretKey.length();
        deficit = inputString.length()%n;
        if(deficit != 0) {
            deficit = n-deficit;
            for(int a = deficit; a != 0 ; a--) {
                inputString += "*";
            }
        }
        StringBuffer permutedString = new StringBuffer();
//        System.out.println(“\nTransposition Matrix:”);
        int width = inputString.length()/n;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < width ; j++) {
                char c = inputString.charAt(i+(j*n));
                System.out.print(c);
                permutedString.append(c);
            }
            System.out.println();
        }
//        System.out.println(transpositionOutput);
        return permutedString.toString();
    }

    public String decryptWithPerm(String inputString, String secretKey){
        int n = secretKey.length();
        n = inputString.length()/n;
        StringBuffer reorganisedString = new StringBuffer();
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j< n ; j++) {
                char c = inputString.charAt(i+(j*n));
                System.out.print(c);
                reorganisedString.append(c);
            }
            System.out.println();
        }


        return reorganisedString.toString();
    }
}
