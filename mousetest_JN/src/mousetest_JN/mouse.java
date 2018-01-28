package mousetest_JN;

import net.java.games.input.*;

public class mouse {
	static float data;
	public static float PollAxis(Component c,Controller a) {
			a.poll();
		data = c.getPollData();
		return data;
	}
	public static void main(String args[]) {
		
		Controller mouse = null;
		Component x = null;
		Component y =null;
		float Xdata =1.0f;
		float Ydata =1.0f;
		
		Controller[] controller = ControllerEnvironment.getDefaultEnvironment().getControllers();
		
		for(int i = 0;i<controller.length;i++) {
			System.out.println(controller[i]);
		}
		mouse = controller[0];
		System.out.println("found "+mouse.toString());
		
		Component[] component = mouse.getComponents();
		for(int i = 0; i<component.length;i++) {
			System.out.println(component[i]);
			if(component[i].getName()=="x") {
				x=component[i];
			}
			if(component[i].getName()=="y") {
				y=component[i];
			}
		}
		System.out.println("found "+x.getIdentifier()+" component");
		System.out.println("found "+y.getName()+ " component");
		
		while(true) {
			System.out.println("x: "+PollAxis(x,mouse)+"	"+"y: "+PollAxis(y,mouse));
			
		}
		
	}
}

