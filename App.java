import javax.swing.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
    	//Define Board Dimensions
    			/**
    			Sets the dimensions of the game board to 360 pixels wide and 640 pixels tall.
    			**/
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
     // Set JFrame Properties 
        
        // frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);//Sets the size of the frame to match the game board dimensions.
        frame.setLocationRelativeTo(null); // Centers the frame on the screen.
        frame.setResizable(false); //// Prevents the user from resizing the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();//Instantiates a FlappyBird object, which is the main game panel.
        frame.add(flappyBird); 	//add game panel
        frame.pack(); //Causes the frame to be resized to fit the preferred size and layouts of its subcomponents (in this case, the ChromeDinosaur panel).
        flappyBird.requestFocus();   //Requests focus for the game panel to ensure it can capture keyboard input.
        frame.setVisible(true); //Makes the frame visible on the screen.
    }
}
