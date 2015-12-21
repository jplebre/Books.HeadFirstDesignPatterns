public class RemoteUser {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        CeilingFanOnHighCommand ceilingFanHigh = new CeilingFanOnHighCommand(ceilingFan);
        CeilingFanOnMediumCommand ceilingFanMedium = new CeilingFanOnMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        StereoOnPlayCDCommand stereoOnPlayCD = new StereoOnPlayCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOnCommands = {livingRoomLightOn, ceilingFanMedium, stereoOnPlayCD};
        Command[] partyOffCommands = {livingRoomLightOff, ceilingFanOff, stereoOff};
        MacroCommand partyModeMacroOn = new MacroCommand(partyOnCommands);
        MacroCommand partyModeMacroOff = new MacroCommand(partyOffCommands);

        remoteControl.setCommand(0, partyModeMacroOn, partyModeMacroOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        System.out.println("Testing Party Mode macro:");
        remoteControl.buttonPushedOn(0);
        remoteControl.buttonPushedOff(0);

        System.out.println("Testing Party Mode undo:");
        remoteControl.buttonPushedOn(0);
        remoteControl.undoButtonPushed();

        System.out.println("Testing Party mode undo with ceiling fan other than off:");
        remoteControl.buttonPushedOn(1);
        remoteControl.buttonPushedOn(0);
        remoteControl.undoButtonPushed();
    }
}