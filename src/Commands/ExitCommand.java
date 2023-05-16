package Commands;

import Exceptions.WrongAmountOfArgumentsException;
import Utility.CollectionOrgan;

public class ExitCommand implements Command{
    public ExitCommand(){

    }
    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescription() {
        return "прекращение работы программы";
    }

    @Override
    public void execute(String[] arguments) {

        try {
            if(arguments.length > 1) throw new WrongAmountOfArgumentsException();
            System.out.println("bye bye");
            System.exit(0);
        }catch (WrongAmountOfArgumentsException ex) {
            System.out.println("Неверное использование команды, попробуйте: " + getName());
        }

    }
}
