public class CeilingFanOnLowCommand implements Command{
  CeilingFan ceilingFan;
  int previousSetting;

  public CeilingFanOnLowCommand(CeilingFan ceilingFan){
    this.ceilingFan = ceilingFan;
    this.previousSetting = ceilingFan.getSpeed();
  }

  public void execute(){
  	this.previousSetting = ceilingFan.getSpeed();
    ceilingFan.low();
  }

  public void undo(){
  	ceilingFan.settingByNumber(this.previousSetting);
  }
}