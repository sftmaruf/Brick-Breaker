package brick._breaker;

import javax.swing.JFrame;

public class Brick_Breaker {

<<<<<<< HEAD
	public static final int Width = 640, Height = 480;
	public static boolean show = false, run = true, ON = false;

	public static void main(String[] args) {

		// load main panel
		MainPanel form = new MainPanel();
		form.show();

		while (run) {
			System.out.println(); // for slow down while loop and capture the next condition

			if (getShow() == true) {
				SetAllMechanismByFacade.mechanism();
				run = false;
			}
		}
	}

	public static void setShow(boolean show) {
		Brick_Breaker.show = show;
	}

	public static boolean getShow() {
		return show;
	}

	public static void set_GuestMode(boolean ON) {
		Brick_Breaker.ON = ON;
	}

	public static boolean get_GuestMode() {
		return ON;
	}
=======
    public static final int Width = 640, Height = 480;
    public static boolean show = false, run = true, ON = false;
     
    public static void main(String[] args) {

    	//load main panel
        MainPanel form = new MainPanel();
        form.show();

        while (run) {
            System.out.println(); //for slow down while loop and capture the next condition
            
            if (getShow() == true) {
                SetAllMechanismByFacade.mechanism();
                run = false;
            }
        }
    }

    public static void setShow(boolean show) {
        Brick_Breaker.show = show;
    }

    public static boolean getShow() {
        return show;
    }
    
    public static void set_GuestMode(boolean ON){
        Brick_Breaker.ON = ON;
    }
    
    public static boolean get_GuestMode(){
        return ON;
    }
>>>>>>> 1d1ed9dacbc6b043b52db3c05174ab4cf570933d

}
