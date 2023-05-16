package Commands;

import Exceptions.WrongAmountOfArgumentsException;
import Utility.CollectionOrgan;

public class HelpCommand implements Command {
    public HelpCommand(){

    }
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "вывод списка команд";
    }

    @Override
    public void execute(String[] arguments) {
        try {
            if(arguments.length > 1) throw new WrongAmountOfArgumentsException();
            System.out.println("help : вывести справку по доступным командам\n" +
                    "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                    "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                    "insert null {element} : добавить новый элемент с заданным ключом\n" +
                    "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                    "remove_key null : удалить элемент из коллекции по его ключу\n" +
                    "clear : очистить коллекцию\n" +
                    "save : сохранить коллекцию в файл\n" +
                    "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                    "exit : завершить программу (без сохранения в файл)\n" +
                    "remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
                    "replace_if_lowe null {element} : заменить значение по ключу, если новое значение меньше старого\n" +
                    "remove_greater_key null : удалить из коллекции все элементы, ключ которых превышает заданный\n" +
                    "max_by_area : вывести любой объект из коллекции, значение поля area которого является максимальным\n" +
                    "count_greater_than_climate climate : вывести количество элементов, значение поля climate которых больше заданного\n" +
                    "filter_contains_name name : вывести элементы, значение поля name которых содержит заданную подстроку");
        }catch (WrongAmountOfArgumentsException ex) {
            System.out.println("Неверное использование команды, попробуйте: " + getName());
        }
    }

}
