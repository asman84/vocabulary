package uz.pdp;

import uz.pdp.service.VocabularyService;
import uz.pdp.service.VocabularyServiceImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VocabularyService service = new VocabularyServiceImpl();
        service.init();
    }
}
