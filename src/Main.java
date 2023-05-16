import Exceptions.WrongAmountOfArgumentsException;
import Exceptions.WrongIdException;
import Utility.CollectionOrgan;
import Utility.CommandProcessing;

public class Main {
    public static void main(String[] args) throws WrongAmountOfArgumentsException, WrongIdException {
        CollectionOrgan collectionOrgan = new CollectionOrgan();
        collectionOrgan.collectionPutting();
        CommandProcessing commandProcessing = new CommandProcessing();
        commandProcessing.commandProc();
    }



}