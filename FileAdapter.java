/**
 * Class serves as an adapter to the two login file and the analysis file in the system
 * @author Calvin Nguyen
 */
public class FileAdapter extends readFile {

	//login file
	private loginFile Login_File = new loginFile();
	
	//analysis file
	private analysisFile Analysis_File = new analysisFile();
	
	/**
	 * @param Request is a String that will contain whether the login file or the analysis file data is needed
	 * @return 2D array containing valid credentials or valid combinations
	 */
	public String[][] getFileData (String Request) {
	
		if (Request.equals("login")) {
			return Login_File.getFileData();
		}
		else {
			return Analysis_File.getFileData();
		}
		
	}
	
}
