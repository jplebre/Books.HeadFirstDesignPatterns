public class CeilingFanOnHighCommand implements Command{
  CeilingFan ceilingFan;
  int previousSetting;

  public CeilingFanOnHighCommand(CeilingFan ceilingFan){
    this.ceilingFan = ceilingFan;
    this.previousSetting = ceilingFan.getSpeed();
  }

  public void execute(){
    this.previousSetting = ceilingFan.getSpeed();
    ceilingFan.high();
  }
  
  public void undo(){
  	ceilingFan.settingByNumber(this.previousSetting);
  }
}