package Commands;

import Exceptions.WrongAmountOfArgumentsException;
import Exceptions.WrongIdException;
import Utility.CollectionOrgan;

public class RemoveGreaterKeyCommand implements Command{
    public RemoveGreaterKeyCommand(){

    }
    @Override
    public String getName() {
        return "remove_greater_key id";
    }

    @Override
    public String getDescription() {
        return "удаление из коллекции всех элементов, чей ключ превышает заданный";
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
                            try {
                                if(CollectionOrgan.cityHashMap.containsKey(key+1)){
                                    CollectionOrgan.remove_greater_key(key);
                                    System.out.println("Строки успешно удалены");
                                } else throw new WrongIdException();
                            } catch (WrongIdException ex3){
                                System.out.println("Строк с ключом больше заданного не существует");
                            }
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
