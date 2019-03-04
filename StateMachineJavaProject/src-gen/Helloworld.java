package saap.Xtend.main;
	
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Helloworld {

	private State current;
	
	private List<State> states = new ArrayList();
	
	
	public Helloworld() {
		this.current = new Closed();
		
		// Adding every states
		this.states.add(new Closed());
		this.states.add(new Opened());
		this.states.add(new Down());
	}
	
	/**
	 * Hande the state change.
	 * @param transition, the transition name wanted by the user.
	 */
	 public String next(String transition){
	 // closedToOpened transition from closed to opened
	 if(transition.toLowerCase().equals("closedToOpened".toLowerCase())) {
	 	
	 	// If the current state is closed
	 	if("closed".equals(this.current.getName())) {
	 	
	 		this.current = states.stream().filter(state -> state.getName().equals("opened")).findFirst().get();
	 		return "Transition : closedToOpened from closed to opened";
	 	} else {
	 		return "## Can't run transition closedToOpened because the current state is "+this.current.getName()+" and should be closed";
	 	}
	 }
	 
	 // openedToClosed transition from opened to closed
	 if(transition.toLowerCase().equals("openedToClosed".toLowerCase())) {
	 	
	 	// If the current state is opened
	 	if("opened".equals(this.current.getName())) {
	 	
	 		this.current = states.stream().filter(state -> state.getName().equals("closed")).findFirst().get();
	 		return "Transition : openedToClosed from opened to closed";
	 	} else {
	 		return "## Can't run transition openedToClosed because the current state is "+this.current.getName()+" and should be opened";
	 	}
	 }
	 
	 // stop transition from opened to down
	 if(transition.toLowerCase().equals("stop".toLowerCase())) {
	 	
	 	// If the current state is opened
	 	if("opened".equals(this.current.getName())) {
	 	
	 		this.current = states.stream().filter(state -> state.getName().equals("down")).findFirst().get();
	 		return "Transition : stop from opened to down";
	 	} else {
	 		return "## Can't run transition stop because the current state is "+this.current.getName()+" and should be opened";
	 	}
	 }
	 
	 // stop transition from closed to down
	 if(transition.toLowerCase().equals("stop".toLowerCase())) {
	 	
	 	// If the current state is closed
	 	if("closed".equals(this.current.getName())) {
	 	
	 		this.current = states.stream().filter(state -> state.getName().equals("down")).findFirst().get();
	 		return "Transition : stop from closed to down";
	 	} else {
	 		return "## Can't run transition stop because the current state is "+this.current.getName()+" and should be closed";
	 	}
	 }
	 
	else
	{
		return "transition " + transition + " does not exists.";
	}
	}
	
	public static void main(String[] args) {
		// Create a new StateMachine
		Helloworld helloworld = new sAAP.impl.StateMachineImpl@10386978 (name: helloworld)();
		
		// First print the init state
		System.out.println("Starting the sAAP.impl.StateMachineImpl@10386978 (name: helloworld) ... press 'exit' to stop.");
		System.out.println("## The init state is : " + Helloworld.current.getName());
	
			Scanner scanner = new Scanner(System.in);
			String entry = "";
			// Main loop
			while (!entry.equals("exit")) {
				System.out.println("## Choose a transition/exit :");
				entry = scanner.nextLine();
				
				// Change the desired state
				String result = helloworld.next(entry);
				
				if (result != null){
					System.out.println(result);
				}
				
				System.out.println("## The current state is : " + helloworld.current.getName());
				
			}
			
			System.out.println("Helloworld has been stopped.");
			
	}
	
	/**
	 * Getter of current.
	 */
	public State getCurrent(){
		return this.current;
	}
	
	/**
	 * Setter of current.
	 */
	public void setCurrent(State current){
		this.current = current;
	}
	}
