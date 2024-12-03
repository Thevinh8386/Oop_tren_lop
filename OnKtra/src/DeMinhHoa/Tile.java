package DeMinhHoa;

public class Tile extends Product{
	private String material;
	private String dimensions;
	
	//Constructor
	public Tile() {
		super();
	}

	public Tile(String product_id, String product_name, double product_price, 
			int product_total, String material, String dimensions) {
		super(product_id, product_name, product_price, product_total);
		this.material = material;
		this.dimensions = dimensions;
	}

	//Getters method
	public String getMaterial() {
		return material;
	}

	public String getDimensions() {
		return dimensions;
	}

	
	//Setters method
	public void setMaterial(String material) {
		this.material = material;f
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	@Override
	public String toString() {
		return super.toString() + ", Tile [material=" + material + ", dimensions=" + dimensions + "]";
	}
	
}
