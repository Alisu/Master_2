package Tp2;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class ASTListE extends ASTVisitor {

	public ASTListE(CompilationUnit cu) {
		super();
		this.cu=cu;
		// TODO Auto-generated constructor stub
	}

	public ASTListE(boolean visitDocTags) {
		super(visitDocTags);
		// TODO Auto-generated constructor stub
	}
	

	Set names = new HashSet();
	CompilationUnit cu;

	public boolean visit(VariableDeclarationFragment node) {
		SimpleName name = node.getName();
		this.names.add(name.getIdentifier());
		System.out.println("Declaration of '"+name+"' at line"+cu.getLineNumber(name.getStartPosition()));
		return false; // do not continue to avoid usage info
	}

	public boolean visit(SimpleName node) {
		if (this.names.contains(node.getIdentifier())) {
		System.out.println("Usage of '" + node + "' at line " +	cu.getLineNumber(node.getStartPosition()));
		}
		return true;
	}

}
