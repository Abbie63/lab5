package Commands;

import Client.ConsoleClient;

public abstract class AbstractCommandWithResult <T> extends AbstractCommand implements CommandWithResult<T>{
    public AbstractCommandWithResult(String name, ConsoleClient consoleClient, Receiver receiver) {
        super(name, consoleClient, receiver);
    }
}
