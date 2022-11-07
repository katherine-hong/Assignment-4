/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class allows different plot objects to 
 * be created and also contains methods to check the plots.
 * Due: 11/08/2022
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Katherine Hong
*/


public class Plot {
	
	// The following are attributes
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	// The following are the constructors
	
	/**
	 * Creates a default plot with width and depth of 1
	 */
	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	/**
	 * Creates a plot with the given values
	 * @param x the x coordinate of the plot
	 * @param y the y coordinate of the plot
	 * @param width the width coordinate of the plot
	 * @param depth the depth coordinate of the plot
	 */
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * Creates a new plot based on given plot
	 * @param otherPlot the plot to be copied
	 */
	public Plot(Plot otherPlot)
	{
		this(otherPlot.getX(), otherPlot.getY(), 
			otherPlot.getWidth(), otherPlot.getDepth());
		
	}
	
	// The following are the setter and getter methods

	/**
	 * Gets the x value
	 * @return x value
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x value
	 * @param x the new x value
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the y value
	 * @return y value
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y value
	 * @param y the new y value
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Gets the width value
	 * @return width value
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the width value
	 * @param width the new width value
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the depth value
	 * @return depth value
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Sets the depth value
	 * @param depth the new depth value
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	// The following is the toString method
	
	/**
	 * Represents a plot object
	 * @return the string representation of a plot
	 */
	@Override
	public String toString()
	{
		return x + "," + y + "," + width + "," + depth;
	}
	
	// The following are the methods
	
	/**
	 * Determine if given plot instance overlaps existing plot
	 * @param plot the plot to test against
	 * @return true if overlaps, false if not
	 */
	public boolean overlaps(Plot plot)
	{
		boolean overlap = true;
		
		// This.plot
		int xcoord1 = this.getX();
		int ycoord1 = this.getY();
		int width1 = this.getWidth();
		int depth1 = this.getDepth();
		
		// Plot parameter
		int xcoord2 = plot.getX();
		int ycoord2 = plot.getY();
		int width2 = plot.getWidth();
		int depth2 = plot.getDepth();
		
		if(xcoord1 >= (xcoord2 + width2) || xcoord2 >= (xcoord1 + width1))
			overlap = false;
		
		if(ycoord1 >= (ycoord2 + depth2) || ycoord2 >= (ycoord1 + depth1))
			overlap = false;
		
//		if(xcoord2 >= (xcoord1 + width1) || xcoord1 >= (xcoord2 + width2))
//			overlap = false;
//		
//		if(ycoord2 >= (ycoord1 + depth1) || ycoord1 >= (ycoord2 + depth2))
//			overlap = false;
		
//		if(xcoord1 > xcoord2 && ycoord1 > ycoord2 && width1 > width2 && depth1 > depth2)
//			overlap = false;
//		else
//			overlap = true;
		
		return overlap;
	}
	
	/**
	 * Determine if given plot is within this plot
	 * @param plot the plot to check if contained
	 * @return true if within plot, false if not
	 */
	public boolean encompasses(Plot plot)
	{
		boolean encompass = false;
		
		// This.plot --> the one that should be inside
		int xcoord1 = this.getX();
		int ycoord1 = this.getY();
		int width1 = this.getWidth();
		int depth1 = this.getDepth();
		
		// Plot parameter --> the plot that SURROUNDS the passed plot
		int xcoord2 = plot.getX();
		int ycoord2 = plot.getY();
		int width2 = plot.getWidth();
		int depth2 = plot.getDepth();
		
//		if(xcoord1 >= xcoord2 && (xcoord1 + width1) <= (xcoord2 + width2)
//		   && ycoord1 >= ycoord2 && (ycoord1 + depth1) <= (ycoord2 + depth2))
//			encompass = true;
		
		if(xcoord2 >= xcoord1 && (xcoord2 + width2) <= (xcoord1 + width1)
				   && ycoord2 >= ycoord1 && (ycoord2 + depth2) <= (ycoord1 + depth1))
					encompass = true;
		
//		if(xcoord1 <= (xcoord2 + width2) && xcoord2 <= (xcoord1 + width1)
//					   && ycoord1 <= (ycoord2 + depth2) && ycoord2 <= (ycoord1 + depth1))
//			encompass = true;
		
//		if((xcoord1))
		
//		if(x < 10 || y < 10 || width < 10 || depth < 10)
//			within = true;
//		else
//			within = false;
		
		return encompass;
	}
	
	

}
