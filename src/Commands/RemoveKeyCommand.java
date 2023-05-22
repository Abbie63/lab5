package Commands;

import Exceptions.WrongAmountOfArgumentsException;
import Exceptions.WrongIdException;
import Utility.CollectionOrgan;

public class RemoveKeyCommand implements Command{
    public RemoveKeyCommand(){

    }
    @Override
    public String getName() {
        return "remove_key key";
    }

    @Override
    public String getDescription() {
        return "удаление элемента коллекции по его ключу";
    }

    @Override
    public void execute(String[] arguments) {

        try {
            if(arguments.length > 2) throw new WrongAmountOfArgumentsException();
            if(CollectionOrgan.cityHashMap.size()!=0) {
                try {
                    int key = Integer.parseInt(arguments[1]);
                    try {
                        if(CollectionOrgan.cityHashMap.containsKey(key)){
                            CollectionOrgan.remove_by_key(key);
                            System.out.println("Строка успешно удалена");
                        } else throw new WrongIdException();
                    }catch (WrongIdException ex2){
                        System.out.println("Строки с таким ключом не существует");
                    }
                }catch (NumberFormatException exc){
                    System.out.println("Аргумент предоставлен в неверном формате, ожидалось числовое значение");
                }
            }else{
                System.out.println("Коллекция пуста, нечего удалять");
            }
        }catch (WrongAmountOfArgumentsException ex) {
            System.out.println("Неверное использование команды, попробуйте: " + getName());
        }

    }
}
