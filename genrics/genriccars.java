package genrics;



public class genriccars implements Comparable<genriccars> {
	 int speed;
	 int price;
	 String color;
	public genriccars(int speed,int price,String color) {
	this.speed=speed;
	this.price=price;
	this.color=color;
	}

	@Override
	public String toString() {
		return "speed is"+this.speed+"price is"+this.price+"color is"+this.color;
	}

	@Override
	public int compareTo(genriccars o) {
		
		return o.speed-this.speed ;
	}
}
