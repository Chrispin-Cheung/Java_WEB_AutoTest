package arraylistop;

public class Dog {
	public String color;
	public String kind;
	public String name;
	public String owner;
	public Dog(String rcolor,String rkind,String rname,String rowner)
	{
		this.color = rcolor;
		this.kind = rkind;
		this.name = rname;
		this.owner = rowner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
