public class RemoteUser {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnHighCommand ceilingFanHigh = new CeilingFanOnHighCommand(ceilingFan);
        CeilingFanOnMediumCommand ceilingFanMedium = new CeilingFanOnMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnPlayCDCommand stereoOnPlayCD = new StereoOnPlayCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnPlayCD, stereoOff);
        remoteControl.setCommand(4, ceilingFanMedium, ceilingFanOff);

        System.out.println(remoteControl);

        remoteControl.buttonPushedOn(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
        
        System.out.println("\n");
        remoteControl.buttonPushedOff(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();

        System.out.println("Undo should be no command:");
        System.out.println(remoteControl);

        remoteControl.buttonPushedOn(1);
        remoteControl.buttonPushedOff(1);
        remoteControl.buttonPushedOn(3);
        remoteControl.buttonPushedOff(3);


        System.out.println("Testing the Celing Fan Undo:");
        remoteControl.buttonPushedOn(4);
        remoteControl.buttonPushedOn(2);
        remoteControl.undoButtonPushed();


    }
}