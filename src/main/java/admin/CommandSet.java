package admin;

import command.Command;
import command.ExitCommand;
import command.MorphologicCommand;
import command.TfidfCommand;
import db.TokenDAO;
import itu.LabelMorph;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mustafa on 26.04.2017.
 */
public class CommandSet {
    private Map<String, Command> commandMap;

    public CommandSet() {
        commandMap = new HashMap<String, Command>();
        commandMap.put("exit", new ExitCommand());
        commandMap.put("morpha", new MorphologicCommand(new TokenDAO(), new LabelMorph()));
        commandMap.put("tfidf", new TfidfCommand());
    }

    public void run(String command) {
        String[] parseList = command.split(" ");

        if(commandMap.get(parseList[0]) == null) {
            System.out.println("Komut bulunamadı");
        } else {
            commandMap.get(parseList[0]).execute(parseList);
        }
    }
}
