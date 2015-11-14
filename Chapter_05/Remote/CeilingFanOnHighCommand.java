public class CeilingFanOnHighCommand implements Command{
  CeilingFan ceilingFan;

  public CeilingFanOnHighCommand(CeilingFan ceilingFan){
    this.ceilingFan = ceilingFan;
  }

  public void execute(){
    ceilingFan.high();
  }

}