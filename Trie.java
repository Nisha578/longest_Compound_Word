
import java.util.*;


// trie implementation
public class Trie {
static class Node {
    Node[] children;
    boolean eow;

    public Node() {
        children = new Node[26];
        for(int i = 0; i<26; i++) {
            children[i] = null;
        }
        eow = false;
    }
}
static Node root = new Node();
  // insert method to add letter in the form of trie data structure
public static  void insert(String word) {
    for(int i =0 ; i< word.length(); i++) {
        int idx = word.charAt(i) - 'a';

        if(root.children[idx] == null) {
//         add new node
            root.children[idx] = new Node();
        }
        if(i == word.length() - 1) {
            root.children[idx].eow = true;
        }
        root = root.children[idx];
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the size of words:");
        int size = sc.nextInt();
        System.out.println("Enter the words:");
String[] words = new String[size];

        for(int i = 0; i< size; i++) {
            words[i] = sc.next();
        }

        for(int i = 0; i< words.length; i++) {
            insert(words[i]);
        }

        List<String> answords = findConcatenatedWords(words);
       int maxLength = 0;
        String longest = "";
        String sec_longest = "";

        for(int i = 0; i < answords.size(); i++) {
            if(answords.get(i).length() >= maxLength) {
             sec_longest = answords.get(i);
                maxLength = answords.get(i).length();
               longest = answords.get(i+2);
            }
            maxLength++;
        }


       float time = System.currentTimeMillis();
        System.out.println("Longest Compound Word: " + longest);
        System.out.println("Second Longest Compound Word: " + sec_longest);
        System.out.println("Time taken to process file Input_02.txt: " +time);
    }
  // Method to find concatenate word
public static List<String> findConcatenatedWords(String[] words) {
    Set<String> s = new HashSet<>();
    List<String> ans = new ArrayList<>();
    for(String word: words)
        s.add(word);
        for(String word : words){
            if(check(word,s))
                ans.add(word);
        }


    return ans;
}
// Method to check the concatenate word or not
    public static boolean check(String word, Set<String> s) {
for(int i = 1; i<word.length(); i++) {
    String prefix = word.substring(0,i);
    String suffix = word.substring(i,word.length());
    if(s.contains(prefix) && (s.contains(suffix) || check(suffix,s)))
        return true;

}
return false;
    }

}
