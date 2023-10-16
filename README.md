# longest_Compound_Word
This repository contains the approach and solution of the problem.

Approach:

1-> We try to solve this problem by implementing the trie data structure so that it can add letters by using the insert() method in the form of a tree, we take node class where we take children array and end of the word(eow) it tells where the word complete.

2-> Then make a function findConcatenatedWords() to find concatenate words here we store all words in the form of a set data structure so that it can avoid duplicate words and
list data structure to store all words after iterating all words in the list we make a function check().

3-> check() method is used to check whether the concatenate or not, if exists return true otherwise return false. Here divide the word and store its prefix and suffix variable
and check if prefix and suffix contains in the set or call the function check again so that it checks all words in the set and after satisfying the condition it returns true 
otherwise returns false.

4-> And add words in the ans arraylist. Finally, it returns and stores to the answers arraylist. declare maxLength, longest, and sec_longest variables where applying for loop 
to iterate to the answords and check the condition if the answords length is greater than equal to the max length, store words into the longest var and second largest to the sec_longest variable, then print all these things in the console or display all outputs to the console.

5->insertion of trie take O(n) and arraylist take O(1) and set take O(log n)
