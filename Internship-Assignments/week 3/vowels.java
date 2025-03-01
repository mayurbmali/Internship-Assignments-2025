public class vowels {
    public static void main(String[] args) {
        String input = "Mayur Mali";
        String inputLowerCase = input.toLowerCase();

        int vowels = 0 ;
        int consonants = 0;
        int spaces = 0;

        for (int i = 0; i < inputLowerCase.length(); i++) {
            char ch = inputLowerCase.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }
}
