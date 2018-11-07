//© A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		//calls the constructor for JFrame
		super("Graphics Runner");

		//sets the height of the window
		setSize(WIDTH,HEIGHT);

		//replace "Circles" with the name of the class that describes what you want to draw. 
		getContentPane().add(new Circles());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		//All the main method does is call the constructor for GraphicsRunner (this class)
		GraphicsRunner run = new GraphicsRunner();
	}
}