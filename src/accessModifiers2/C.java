package accessModifiers2;

public class C {
	
	
	//this is accessible from other package within the project 
	public String publicMessage = "This is public";

	// protected variable is only accessible to other classes that are sub class of
	// where the
	// the protected variable is declared

	String defaultMessage= "This is the default";
	// anything using the default access modifier is only visible
	// within the same package


}
