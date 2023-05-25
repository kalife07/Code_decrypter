import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Code_decrypter
{
    public static void main(String[] args){
        StringBuilder message = new StringBuilder();
        char[] substitution = {'X', 'M', 'K', 'L', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] alphabet = {'A','B','C','D','E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.println("Enter a message to decrypt:");
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        System.out.println(code_decrypter(code, alphabet, substitution, message));


    }
    public static StringBuilder code_decrypter(String code, char[] alphabet, char[] substitution, StringBuilder message){
        List<Integer> char_indexes = new ArrayList<>();
        for (int i=0; i<code.length(); i++){
            for (int j=0; j<26; j++){
                if (code.charAt(i)==substitution[j]){
                    char_indexes.add(j);
                }
            }
        }
        for (int i=0; i<char_indexes.size(); i++){
            int x = char_indexes.get(i);
            message.append(alphabet[x]);
        }
        return message;
    }
}