package db;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import model.UniqueWord;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mustafa on 26.04.2017.
 */
public class UniqueWordDAO {
    private Session session;

    public Set<UniqueWord> getAllWords() {
        String query = "SELECT * FROM unique_word";
        ResultSet result = session.execute(query);
        Set<UniqueWord> uniqueWordSet = new HashSet<UniqueWord>();

        for(Row row: result) {
            UniqueWord uniqueWord = new UniqueWord(row.getString(0));
            uniqueWord.setSourceSet(row.getSet(1, String.class));
            uniqueWordSet.add(uniqueWord);
        }

        return uniqueWordSet;
    }

    public boolean update(Set<UniqueWord> uniqueWordSet) {
        return true;
    }
}
