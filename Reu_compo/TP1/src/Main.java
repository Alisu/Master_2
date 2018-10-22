
public class Main {

	public static void main(String[] args) {
		Root t = new Root();
		RegularDirectory rd = new RegularDirectory("media", t);
		File f = new File("file1",rd);
		File f2 = new File("file2",t);
		
		//System.out.println(f2.getAbsoluteAdresse());
		//System.out.println(f.getAbsoluteAdresse());
		t.ls();
	}

}
