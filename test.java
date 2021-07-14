import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		
		ViewerList a = new ViewerList();
		
		a.addViewer("Bar Chart");
		a.addViewer("Scatter");
		
		String[] b = a.getViewers();
		
		for (int i = 0 ; i < a.getNumViewers() ; i++) {
			System.out.println(b[i]);
		}
		

	}

}
