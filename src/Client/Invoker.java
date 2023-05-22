package Client;

import Commands.AbstractCommand;
import Commands.AbstractCommandWithResult;

public class Invoker {
    public void execute(AbstractCommand abstractCommand) {
        abstractCommand.execute();
    }
    public <T> T executeWithReturn(AbstractCommandWithResult<T> command) {
        command.execute();
        return command.getResult();
    }
}
