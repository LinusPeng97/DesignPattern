package main.java.pers.linus.behavior.command;

import java.util.LinkedList;

public class Invoker {
    private LinkedList<Command> commandLinkedList = new LinkedList<>();

    public void takeCommand(Command command) {
        commandLinkedList.add(command);
    }

    public void executeCommand() {
        for (Command command : commandLinkedList) {
            command.execute();
        }
        commandLinkedList.clear();
    }
}
