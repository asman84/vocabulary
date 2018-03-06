package uz.pdp.service;

import uz.pdp.models.Word;

import java.util.*;

public class VocabularyServiceImpl implements VocabularyService {
    Set<String> listOfWords = new HashSet();
    List<Word> vocabulary = new LinkedList();

    @Override
    public void init() {
        System.out.println("please choose action you want to take:1=Add New Word; 2=Edit Word Existing; 3=Delete Word; 4=print All; 5=Translate; 6=Sort; 0=Exit");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        while (action != 0){
            switch(action){
                case 1:
                    addWord();
                    break;
                case 2:
                    editWord();
                    break;
                case 3:
                    deleteWord();
                    break;
                case 4:
                    printAll();
                    break;
                case 5:
                    translation();
                    break;
                case 6:
                    sort();
                    break;
            }
            System.out.println("please choose action you want to take:1=Add New Word; 2=Edit Word Existing; 3=Delete Word; 4=print All; 5=Translate; 6=Sort; 0=Exit");
            action = scanner.nextInt();
        }
    }

    @Override
    public void addWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type a new word you want to add");
        String newWord = scanner.next();

        System.out.println("Now, please enter your translation of that word");
        String translationOfNewWord = scanner.next();

        System.out.println("Please write some example sentances using new word you are adding");
        String exampleSentanceOfNewWord = scanner.next();

        listOfWords.add(newWord);
        Word word = new Word(newWord, translationOfNewWord, exampleSentanceOfNewWord);
        vocabulary.add(word);
    }

    @Override
    public void editWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which word do you intend to change/edit?");
        String editWord = scanner.next();
        if (listOfWords.contains(editWord)) {
            System.out.println("set new translation");
            String edittedTranslation = scanner.next();
            for (int i = 0; i < vocabulary.size(); i++) {
                if (vocabulary.get(i).getWord().equals(editWord)) {
                    vocabulary.get(i).setTranslation(edittedTranslation);
                }
            }
        } else {
            System.out.println("there is no such word you entered");
        }
    }

    @Override
    public void deleteWord() {
        System.out.println("please fill in the word you want to delete");
        Scanner scanner = new Scanner(System.in);
        String deleteWord = scanner.next();
        listOfWords.remove(deleteWord);
        for (int i = 0; i < vocabulary.size(); i++) {
            if (vocabulary.get(i).getWord().equals(deleteWord)) {
                vocabulary.remove(i);
            }
        }
    }

    @Override
    public void printAll() {
        System.out.println(vocabulary);
    }

    @Override
    public void translation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which word do you like to translate?");
        String wordForTranslate = scanner.next();

        if (listOfWords.contains(wordForTranslate)) {
            for (int i = 0; i < vocabulary.size(); i++) {
                if (vocabulary.get(i).getWord().equals(wordForTranslate)) {
                    System.out.println(vocabulary.get(i).getTranslation());
                    System.out.println(vocabulary.get(i).getExample());
                }
            }
        }
    }

    @Override
    public void sort() {

    }
}
