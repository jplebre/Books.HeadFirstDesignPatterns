public class CeilingFanOffCommand implements Command{
  CeilingFan ceilingFan;
  int previousSetting;

  public CeilingFanOffCommand(CeilingFan ceilingFan){
    this.ceilingFan = ceilingFan;
    this.previousSetting = ceilingFan.getSpeed();
  }

  public void execute(){
  	this.previousSetting = ceilingFan.getSpeed();
    ceilingFan.off();
  }

  public void undo(){
  	ceilingFan.settingByNumber(this.previousSetting);
  }
}