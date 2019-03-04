package saap.Xtend.main;

/**
 * A State used by a {@Link Helloworld}
 * @author generated
 */
public abstract class State {
	
	private String name;
			
	/**
	 * Getter of name.
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Setter of name.
	 */
	public void setName(String name){
		this.name = name;
	}
}
