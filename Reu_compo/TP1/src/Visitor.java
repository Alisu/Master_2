
public abstract class Visitor {
	
	public abstract void VisitFile(File f);

	public abstract void VisitRegularDirectory(RegularDirectory rd);

	public abstract void VisitRoot(Root r);

}
