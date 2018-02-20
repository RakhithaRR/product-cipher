/**
 * Created by User on 20/02/2018.
 */
public class Substitution
{
    public String encryptWithSub(String inputString){
        String encryptedString = "";
        for(int i=0 ; i<inputString.length() ; i++) {
            char c = inputString.charAt(i);
            if(i%2 == 0){
                encryptedString += ((char) (c + 3));
            }
            else{
                encryptedString += ((char) (c + 5));
            }

        }

        return encryptedString;
    }

    public String decryptwithSub(String inputString){
        String decryptedString = "";
        for(int i=0; i<inputString.length(); i++){
            char c = inputString.charAt(i);
            if(i%2 == 0){
                decryptedString += ((char) (c - 3));
            }
            else{
                decryptedString += ((char) (c - 5));
            }
        }

        return decryptedString;
    }
}
