package Commands;

import Client.ConsoleClient;

public abstract class AbstractCommand implements Command{
    ConsoleClient consoleClient;
    final Receiver receiver;
    final String name;

    public AbstractCommand(String name, ConsoleClient consoleClient, Receiver receiver) {
    }
    @Override
public String toString(){
        return name;
    }
}
