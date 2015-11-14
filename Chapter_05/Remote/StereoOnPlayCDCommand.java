public class StereoOnPlayCDCommand implements Command{
  Stereo stereo;

  public StereoOnPlayCDCommand(Stereo stereo){
    this.stereo = stereo;
  }

  public void execute(){
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }

}