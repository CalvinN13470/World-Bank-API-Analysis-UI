
public class ViewerList {

	private boolean[] ViewerEnabled;
	
	private int numViewers;
	
	private String[] Viewers;
	
	public ViewerList(){
		
		ViewerEnabled = new boolean[5];
		
		numViewers = 0;
		
	}
	
	public void addViewer(String Viewer) {
		
		if (Viewer.equals("Pie Chart")) {
			ViewerEnabled[0] = true;
			numViewers++;
		}
		else if (Viewer.equals("Line Chart")) {
			ViewerEnabled[1] = true;
			numViewers++;
		}
		else if (Viewer.equals("Bar Chart")) {
			ViewerEnabled[2] = true;
			numViewers++;
		}
		else if (Viewer.equals("Scatter Chart")) {
			ViewerEnabled[3] = true;
			numViewers++;
		}
		else if (Viewer.equals("Report")) {
			ViewerEnabled[4] = true;
			numViewers++;
		}
		
	}
	
	public void removeViewer(String Viewer) {
		
		if (Viewer.equals("Pie Chart")) {
			ViewerEnabled[0] = false;
			numViewers--;
		}
		else if (Viewer.equals("Line Chart")) {
			ViewerEnabled[1] = false;
			numViewers--;
		}
		else if (Viewer.equals("Bar Chart")) {
			ViewerEnabled[2] = false;
			numViewers--;
		}
		else if (Viewer.equals("Scatter Chart")) {
			ViewerEnabled[3] = false;
			numViewers--;
		}
		else if (Viewer.equals("Report")) {
			ViewerEnabled[4] = false;
			numViewers--;
		}
		
	}
	
	public int getNumViewers() {
		return numViewers;
	}
	
	public String[] getViewers() {
		
		Viewers = new String[numViewers];
		
		int i = 0;
		
		if (ViewerEnabled[0]) {
			Viewers[i] = "Pie Chart";
			i++;
		}
		else if (ViewerEnabled[1]) {
			Viewers[i] = "Line Chart";
			i++;
		}
		else if (ViewerEnabled[2]) {
			Viewers[i] = "Bar Chart";
			i++; 
		}
		else if (ViewerEnabled[3]) {
			Viewers[i] = "Scatter Chart";
			i++; 
		}
		else if (ViewerEnabled[4]) {
			Viewers[i] = "Report";
			i++; 
		}
		
		return Viewers;
		
	}
}
