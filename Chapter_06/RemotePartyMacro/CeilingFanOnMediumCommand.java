public class CeilingFanOnMediumCommand implements Command{
  CeilingFan ceilingFan;
  int previousSetting;

  public CeilingFanOnMediumCommand(CeilingFan ceilingFan){
    this.ceilingFan = ceilingFan;
    this.previousSetting = ceilingFan.getSpeed();
  }

  public void execute(){
  	this.previousSetting = ceilingFan.getSpeed();
    ceilingFan.medium();
  }

  public void undo(){
  	ceilingFan.settingByNumber(this.previousSetting);
  }
}