/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class allows different property objects
 * to be created and also sets the attributes for each property.
 * Due: 11/08/2022
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Katherine Hong
*/


public class Property {
	
	// The following are the attributes
	
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	// The following are the constructors
	
	/**
	 * Creates a new property with empty strings,
	 * also creates a new default plot
	 */
	public Property()
	{
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0;
		this.owner = "";
		this.plot = new Plot();
	}
	
	/**
	 * Creates a new property with the given values,
	 * also creates a new default plot
	 * @param propertyName the property name
	 * @param city where the property is located
	 * @param rentAmount the rent amount
	 * @param owner the name of the owner
	 */
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	/**
	 * Creates a new Property object using given values,
	 * and also creates a Plot using given values of a plot
	 * @param propertyName the name of the property
	 * @param city where the city is located
	 * @param rentAmount the rent amount
	 * @param owner the name of the owner
	 * @param x the x coordinate of the plot
	 * @param y the y coordinate of the plot
	 * @param width the width coordinate of the plot
	 * @param depth the depth coordinate of the plot
	 */
	public Property(String propertyName, String city, double rentAmount, String owner,
			 	   int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}
	
	public Property(Property otherProperty)
	{
//		this.propertyName = otherProperty.propertyName;
//		this.city = otherProperty.city;
//		this.rentAmount = otherProperty.rentAmount;
//		this.owner = otherProperty.owner;
//		this.plot = otherProperty.plot;
		
		this(otherProperty.getPropertyName(), otherProperty.getCity(), otherProperty.getRentAmount(),
			otherProperty.getOwner());
		this.plot = new Plot(otherProperty.plot);
		
	}

	
	// The following are the getter and setter methods
	// In this case javadoc only asked for getter methods
	
	/**
	 * Gets the property name
	 * @return the property name
	 */
	public String getPropertyName() {
		return propertyName;
	}
	
	/**
	 * Sets the property name
	 * @param propertyName the new property name
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	/**
	 * Gets the city name
	 * @return the city name
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city name
	 * @param city the new city name
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the rental amount
	 * @return the rental amount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	
	/**
	 * Sets the rent amount
	 * @param rentAmount the new rent amount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	/**
	 * Gets the owner name
	 * @return the owner name
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * Sets the owner name
	 * @param owner the new owner name
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * Gets the plot
	 * @return the plot
	 */
	public Plot getPlot() {
		return plot;
	}
	
	/**
	 * Sets the plot
	 * @param plot the new plot
	 */
//	public void setPlot(Plot plot) {
//		this.plot = new Plot (plot);
//	}

	// The following is the toString method
	
	@Override
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
	

}
