package Commands;

import Exceptions.WrongAmountOfArgumentsException;
import Exceptions.WrongIdException;
import Utility.CollectionOrgan;

public class InsertCommand implements Command{
    public InsertCommand(){

    }
    @Override
    public String getName() {
        return "insert key";
    }

    @Override
    public String getDescription() {
        return "добавление нового элемента с заданным ключом";
    }

    @Override
    public void execute(String[] arguments) {

        try {
            if(arguments.length > 2) throw new WrongAmountOfArgumentsException();
            int key = Integer.parseInt(arguments[1]);
            try {
                if(CollectionOrgan.cityHashMap.containsKey(key)) throw new WrongIdException();

            } catch(WrongIdException ex1) {
                System.out.println("Строка с таким ключом уже существует");
            }
        }catch (WrongAmountOfArgumentsException ex) {
            System.out.println("Неверное использование команды, попробуйте: " + getName());
        }

    }

}
