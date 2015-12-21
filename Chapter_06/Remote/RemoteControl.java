public class RemoteControl {
    //this class creates the remote control and lets user
    //set up the buttons and press on/off
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        undoCommand = new NoCommand();
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i <7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    //User functions
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void buttonPushedOn(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void buttonPushedOff(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed(){
        System.out.println("Undo:");
        undoCommand.undo();
        undoCommand = new NoCommand();
    }

//overriding toString method
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ------ Remote Control ------ \n");

        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }

        stringBuffer.append("[Undo command] " + undoCommand.getClass().getName());

        return stringBuffer.toString();
    }
}