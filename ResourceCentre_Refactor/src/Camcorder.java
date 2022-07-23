
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
<<<<<<< HEAD
	}
	
	public String toString(){
		String output = super.toString();
		// Write your codes here
		output = String.format("%-63s %-20d", output, opticalZoom);
		
		return output;
=======
	}

	public String toString(){
		// Write your codes here
		String info = super.toString();
		
		return String.format("%-63s %-20d", info , opticalZoom);
>>>>>>> branch 'master' of https://github.com/20041279-Fazly/Resource_CentreRefactor.git
	}
}

