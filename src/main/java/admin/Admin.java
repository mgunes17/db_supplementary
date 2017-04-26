package admin;

import model.Token;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by mustafa on 26.04.2017.
 */
public class Admin {

    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.run();
    }

    private void run() {
        CommandSet commandSet = new CommandSet();
        boolean next = true;

        while(next) {
            Scanner in = new Scanner(System.in);
            System.out.print("Komut giriniz=>");
            String commandInput = in.nextLine();

            if(!commandInput.equals("exit"))
                commandSet.run(commandInput);
            else
                next = false;
        }
    }
}
