import java.util.Scanner;
import java.util.ArrayList;

public class CaesarCipher {

    private ArrayList<Character> mapping = new ArrayList<>();
    private int key;

    private CaesarCipher(int key) {

        this.key = key;

        char letter = 'a';
        for (int val = 0; val < 26; val++) {
            mapping.add(letter++);
        }
    }

    private String encrypt(String plainText) {
        String cipherText = "";

        for (char c : plainText.toLowerCase().toCharArray()) {
            if (c == ' ') {
                cipherText += " ";
            } else {

                int pos = (mapping.indexOf(c) + key) % 26;
                cipherText += String.valueOf(mapping.get(pos));
            }
        }

        return cipherText;
    }

    private String decrypt(String cipherText) {
        String plainText = "";

        for (char c : cipherText.toLowerCase().toCharArray()) {
            if (c == ' ') {
                plainText += " ";
            } else {
                int pos = (26 + mapping.indexOf(c) - key) % 26;
                plainText += String.valueOf(mapping.get(pos));
            }
        }

        return plainText;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("_____________________________");
        System.out.println("\n\tCaesar Cipher");
        System.out.println("_____________________________\n\n");

        System.out.print("Enter Cipher key : ");
        int key = sc.nextInt();
        System.out.println();

        CaesarCipher cipher = new CaesarCipher(key);

        System.out.print("Enter the Plain Text: ");
        sc.nextLine();
        String plainText = sc.nextLine();

        System.out.println("The corresponding Cipher Text is: "+cipher.encrypt(plainText));

        System.out.println();

        System.out.print("Enter the Cipher Text: ");
        String cipherText = sc.nextLine();

        System.out.println("The corresponding Plain Text is: "+cipher.decrypt(cipherText));

        sc.close();
    }
}