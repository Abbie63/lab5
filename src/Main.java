import Exceptions.WrongAmountOfArgumentsException;
import Exceptions.WrongIdException;
import Utility.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws WrongAmountOfArgumentsException, WrongIdException, IOException {
        CollectionOrgan collectionOrgan = new CollectionOrgan();
        collectionOrgan.collectionPutting();

        String filename = "/Users/abbie/IdeaProjects/lab5/src/start.json";
        JsonFileUtility jsonFileUtility = new JsonFileUtility();
        jsonFileUtility.jsonFileReader(filename);


        CommandProcessing commandProcessing = new CommandProcessing();
        commandProcessing.commandProc();


    }



}