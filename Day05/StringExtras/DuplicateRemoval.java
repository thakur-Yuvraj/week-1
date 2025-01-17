import java.util.Scanner;

public class DuplicateRemoval {
    //using method to replace a given character with another character in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Replacing all occurrences of the word (character) with the replacement word (character)
        return sentence.replace(wordToReplace, replacementWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the sentence and words to be replaced and replaced with
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = sc.nextLine();

        // Calling the replaceWord method
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Output the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        //scanner closed
        sc.close();
    }
}
