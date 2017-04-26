package command;

import db.SourceDAO;
import db.UniqueWordDAO;
import model.UniqueWord;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by mustafa on 26.04.2017.
 */
public class TfidfCommand extends AbstractCommand implements Command {
    private UniqueWordDAO uniqueWordDAO = new UniqueWordDAO();
    private SourceDAO sourceDAO = new SourceDAO();
    private Set<String> uniqueWordSet;
    private List<Map<String, Integer>> sourceWordCountList;

    public boolean execute(String[] parameter) {
        if(!validateParameter(parameter)) {
            return false;
        }

        uniqueWordSet = uniqueWordDAO.getAllWords();
        sourceWordCountList = sourceDAO.getAllSourceWordCount();

        compute();

        return true;
    }

    private void compute() {
        for(String word: uniqueWordSet) {

        }
    }

    protected boolean validateParameter(String[] parameter) {
        if(parameter.length == 1)
            return true;
        else {
            System.out.println("Eksik/Fazla parametre");
            return false;
        }
    }
}
