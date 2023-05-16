package Commands;

import Exceptions.WrongAmountOfArgumentsException;
import Utility.CollectionOrgan;

public class ClearCommand implements Command {
    public ClearCommand(){

    }
    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {
        return "очистка коллекции";
    }

    @Override
    public void execute(String[] arguments) {

        try {
            if(arguments.length > 1) throw new WrongAmountOfArgumentsException();
            if(CollectionOrgan.cityHashMap.size()!=0) {
                CollectionOrgan.collectionClear();
                System.out.println("Коллекция очищена");
            }else{
                System.out.println("Коллекция итак пуста");
            }
        }catch (WrongAmountOfArgumentsException ex) {
            System.out.println("Неверное использование команды, попробуйте: " + getName());
        }

    }
}
