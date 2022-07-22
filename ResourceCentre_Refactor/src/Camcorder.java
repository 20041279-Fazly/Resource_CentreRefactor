
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
<<<<<<< HEAD
		// Write your codes here
		String info = super.toString();
		
		return String.format("%-63s %-20d", info , opticalZoom);
			
=======
		String info = super.toString();
		return String.format("%-63s %-20d", info, getOpticalZoom());
>>>>>>> branch 'master' of https://github.com/20041279-Fazly/Resource_CentreRefactor.git
	}
}

