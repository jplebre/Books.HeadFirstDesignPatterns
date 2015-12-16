public abstract class Beverage {
	public enum Size{ TALL,	GRANDE,	VENTI }

	String description = "Unknown Beverage";
	Size size;

	public String getDescription(){
		return size.toString() + " " + description;
	}

	public void setSize(Size size){
		this.size = size;
	}

	public Size getSize(){
		return this.size;
	}

	public abstract double cost();
}