public class RemoteControl {
    //this class creates the remote control and lets user
    //set up the buttons and press on/off
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
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
    }

    public void buttonPushedOff(int slot){
        offCommands[slot].execute();
    }


//overriding toString method
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ------ Remote Control ------ \n");

        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}