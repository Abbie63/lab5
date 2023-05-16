package Utility;

import Commands.*;
import Exceptions.WrongAmountOfArgumentsException;
import Exceptions.WrongIdException;

import java.util.HashMap;
import java.util.Scanner;

public class CommandProcessing {
    String com, argument1, argument2, line;
    String[] command;

    public  void commandProc() throws WrongAmountOfArgumentsException, WrongIdException {
        do {
        System.out.println("enter command");
        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();



        command = line.split(" ");
        com = command[0];

        switch (com) {
            case  ("help"):
                HelpCommand helpCommand = new HelpCommand();
                helpCommand.execute(command);
                break;
            case ("show"):
                ShowCommand showCommand = new ShowCommand();
                showCommand.execute(command);
                break;
            case ("info"):
                System.out.println("Размер коллекции: " + CollectionOrgan.cityHashMap.size() + "\n" +  "Тип коллекции hashmap" );



                //доделать!!!!!!!!!



                break;
            case ("exit"):
                ExitCommand exitCommand = new ExitCommand();
                exitCommand.execute(command);
                break;
            case ("clear"):
                ClearCommand clearCommand = new ClearCommand();
                clearCommand.execute(command);
                break;
            case ("remove_key"):
                RemoveKeyCommand removeKeyCommand = new RemoveKeyCommand();
                removeKeyCommand.execute(command);
                break;
            case("remove_greater_key"):
                RemoveGreaterKeyCommand removeGreaterKeyCommand = new RemoveGreaterKeyCommand();
                removeGreaterKeyCommand.execute(command);
                break;
            case("remove_lower"):
                RemoveLowerCommand removeLowerCommand = new RemoveLowerCommand();
                removeLowerCommand.execute(command);
                break;
            default:
                System.out.println("такой команды нет");;
                break;
        }} while (com!="exit");
    }



}
