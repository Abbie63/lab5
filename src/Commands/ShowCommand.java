package Commands;

import Exceptions.WrongAmountOfArgumentsException;
import Utility.CollectionOrgan;

public class ShowCommand implements Command{
   public ShowCommand(){

   }
    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescription() {
        return "вывод всех элементов коллекции в строковом представлении";
    }

    @Override
    public void execute(String[] arguments) {
        try {
            if(arguments.length > 1) throw new WrongAmountOfArgumentsException();
            if(CollectionOrgan.cityHashMap.size()!=0) {
                System.out.println(CollectionOrgan.cityHashMap);
            }else{
                System.out.println("Коллекция пуста!");
            }
        }catch (WrongAmountOfArgumentsException ex) {
            System.out.println("Неверное использование команды, попробуйте: " + getName());
        }

    }
}
