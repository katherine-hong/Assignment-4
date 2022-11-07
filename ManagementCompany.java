/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class simulates a management company, and
 * stores different properties and checks the properties to make
 * sure they are encompassed and do not overlap.
 * Due: 11/08/2022
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Katherine Hong
*/


public class ManagementCompany {
	
	// The following are the constant values
	
	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_DEPTH = 10;
	public static final int MGMT_WIDTH = 10;
	
	// The following are the attributes
	
	private String name; // ManagementCompany name
	private String taxID;
	private double mgmFee;
	private Property[] properties; // = new Property[MAX_PROPERTY];
	private Plot plot;
	private int numOfProperties = 0;
	
	// The following are the constructors
	
	/**
	 * Creates a ManagementCompany object using empty strings, 
	 * creates a default Plot with maximum width and depth and 
	 * it initializes the properties array
	 */
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0.0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	
	
	/**
	 * Creates a ManagementCompany object using given values,
	 * also creates plot with maximum width and depth,
	 * and initializes properties array
	 * @param name management company name
	 * @param taxID the tax ID
	 * @param mgmFee the management fee
	 */
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this();
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;	
	}
	
	/**
	 * Creates ManagementCompany object with given values,
	 * also creates plot with given values, and initializes
	 * the properties array (calls an existing constructor)
	 * @param name of the management company
	 * @param taxID the tax ID
	 * @param mgmFee the management fee
	 * @param x the x coordinate of plot
	 * @param y the y coordinate of plot
	 * @param width the width coordinate of plot
	 * @param depth the depth coordinate of plot
	 */
	public ManagementCompany(String name, String taxID, double mgmFee,
			 				int x, int y, int width, int depth)
	{
		this(name, taxID, mgmFee);
		this.plot = new Plot(x, y, width, depth);
	}
	
	public ManagementCompany(ManagementCompany otherCompany)
	{
//		this(otherCompany.getName(), otherCompany.getTaxID(), otherCompany.getMgmFee());
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(otherCompany.plot);
	}

	// The following are the getter and setter methods
	// In this case javadoc only asked for getter methods ??

	/**
	 * Gets the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name
	 * @param name the new name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the tax ID
	 * @return the tax ID
	 */
	public String getTaxID() {
		return taxID;
	}

	/**
	 * Sets the tax ID
	 * @param taxID the new tax ID
	 */
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	/**
	 * Gets the management fee
	 * @return the management fee
	 */
	public double getMgmFee() {
		return mgmFee;
	}

	/**
	 * Sets the management fee
	 * @param mgmFee the new management fee
	 */
	public void setMgmFee(double mgmFee) {
		this.mgmFee = mgmFee;
	}

	/**
	 * Gets the properties
	 * @return the properties
	 */
	public Property[] getProperties() {
		return properties;
	}

	
//	public void setProperties(Property[] properties) {
//		this.properties = properties;
//	}

	/**
	 * Gets the number of properties
	 * @return the number of properties
	 */
	public int getNumOfProperties() {
		return numOfProperties;
	}

	/**
	 * Sets the number of properties
	 * @param numOfProperties the new number of properties
	 */
	public void setNumOfProperties(int numOfProperties)
	{
		this.numOfProperties = numOfProperties;
	}
	
	/**
	 * Gets the plot
	 * @return the plot
	 */
	public Plot getPlot() {
	    return plot;
	  }

	
//	public void setNumOfProperties(int numOfProperties) {
//		this.numOfProperties = numOfProperties;
//	}
	
	
	// The following are the methods
	
	/**
	 * Creates a property object by copying from another property 
	 * and adds it to the properties array
	 * @param property the property to be added
	 * @return -1 if the array is full, -2 if the Property object is null, 
	 * -3 if management company does not encompass the property plot, 
	 * -4 if property plot overlaps ANY of properties in array, 
	 * otherwise return the index of the array where the property was added
	 */
	public int addProperty(Property property) {
		
		if(isPropertiesFull())
			return -1;
		

	    if (property == null)
	    	return -2;
	    
	    
	    for (int i = 0; i < properties.length;i++) 
	    {
	    	if (properties[i] != null) 
	    	{
	    		if (properties[i].getPlot().overlaps(property.getPlot())) 
	    		{
	    			return -4;
	    		}
	    	} 
	    }
	    
	    if (!plot.encompasses(property.getPlot()))
	    	return -3;
	    else
	    {
	    	properties[numOfProperties]=property;
	  		numOfProperties++;
	  		return (numOfProperties - 1);
	    }
	    
	      
	    
	      
	  }
	
	/**
	 * Adds a new property to the properties array, this method 
	 * should call an appropriate existing overloaded method
	 * @param propertyName the property name
	 * @param city city where property is located
	 * @param rent rent amount
	 * @param ownerName the owner name
	 * @return -1 if the array is full, -2 if the Property object is null, 
	 * -3 if management company does not encompass the property plot, 
	 * -4 if property plot overlaps ANY of properties in array, 
	 * otherwise return the index of the array where the property was added
	 */
	public int addProperty(String name, String city, double rent, String owner) 
	{
		
		Property p1 = new Property(name, city, rent, owner);
		
		if(isPropertiesFull())
			return -1;
			
		// -2
		if(p1 == null)
			return -2;
		
		 if (!plot.encompasses(p1.getPlot()))
			 return -3;
		 
		 for (int i = 0; i < properties.length;i++) 
		    {
		    	if (properties[i] != null) 
		    	{
		    		if (properties[i].getPlot().overlaps(p1.getPlot())) 
		    		{
		    			return -4;
		    		}
		    	} 
		    }
		    
		    if (!plot.encompasses(p1.getPlot()))
		    	return -3;
		    else
		    {
		    	properties[numOfProperties]= p1;
		  		numOfProperties++;
		  		return (numOfProperties - 1);
		    }
		
	}
	
	/**
	 * Adds a new property to the properties array, 
	 * this method should call an appropriate existing overloaded method
	 * @param name property name
	 * @param city city where property is located
	 * @param rent rent amount
	 * @param owner the owner name
	 * @param x the x coordinate of the plot
	 * @param y the y coordinate of the plot
	 * @param width the width coordinate of the plot
	 * @param depth the depth coordinate of the plot
	 * @return -1 if the array is full, -2 if the Property object is null, 
	 * -3 if management company does not encompass the property plot, 
	 * -4 if property plot overlaps ANY of properties in array, 
	 * otherwise return the index of the array where the property was added
	 */
	public int addProperty(String name, String city, double rent, String owner,
			 			  int x, int y, int width, int depth)
	{
		Property p1 = new Property(name, city, rent, owner, x, y, width, depth);
		
		if(isPropertiesFull())
			return -1;
			
		// -2
		if(p1 == null)
			return -2;
		
		 if (!plot.encompasses(p1.getPlot()))
			 return -3;
		 
		 for (int i = 0; i < properties.length;i++) 
		    {
		    	if (properties[i] != null) 
		    	{
		    		if (properties[i].getPlot().overlaps(p1.getPlot())) 
		    		{
		    			return -4;
		    		}
		    	} 
		    }
		    
		    if (!plot.encompasses(p1.getPlot()))
		    	return -3;
		    else
		    {
		    	properties[numOfProperties]= p1;
		  		numOfProperties++;
		  		return (numOfProperties - 1);
		    }

	}
	
//	public int addProperty(String name, String city, double rent, String owner)
//	{
//	
//		int propertyCheck = 0;
//		int full = 0;
//		int isNull = 0;
//		int index = 0;
//		boolean encompass;
//		Property newProperty = new Property(name, city, rent, owner);
////		Plot propertyPlot = newProperty.getPlot();
//		
//		// Check if array is full
//		for(int i = 0; i < properties.length; i++)
//		{
//			if(properties[i] != null)
//			{
//				full++;	
//				index++;
//			}				
//		}
//		
//		//properties[index] = new Property(name, city, rent, owner);
//		// actually don't add property to array here add it at the end 
//		// just get next available index to add it to it
//		
//		if(full == 5)
//		{
//			propertyCheck = -1;
//		}
//		
//		// Check if property object is null
//		
//		if(newProperty == null)
//			propertyCheck = -2;
//		
//		// Check if encompasses
//		
//		//encompass = encompasses(newProperty.plot);
//		
//		
//		return propertyCheck;
//			
//	}
	
	/**
	 * Removes (nullifies) the last element of properties array
	 */
	public void removeLastProperty()
	{
		properties[MAX_PROPERTY -1] = null;
		numOfProperties--;
	}
	
	/**
	 * Checks if the properties array is full
	 * @return true if array is full, false otherwise
	 */
	public boolean isPropertiesFull()
	{
//		boolean full = false;
//		int fullCount = 0;
//		
//		for(int i = 0; i < properties.length; i++)
//		{
//			if(properties[i] != null)
//				fullCount++;					
//		}
//		
//		if(fullCount == 5)
//			full = true;
		
//		return full;
		
		return numOfProperties >= 5;
		
	}
	
	/**
	 * Gets the number of existing properties in array
	 * @return the number of existing properties in array
	 */
	public int getPropertiesCount()
	{
//		int propertyCount = 0;
//		
//		for(int i = 0; i < properties.length; i++)
//		{
//			if(properties[i] != null)
//				propertyCount++;
//		}
//		
//		return propertyCount;
		
		return numOfProperties;
	}
	
	/**
	 * Returns the total rent of the properties in the properties array 
	 * @return the total rent amount
	 */
	public double getTotalRent()
	{
		double totalRent = 0.0;
		
		for(int i = 0; i < numOfProperties; i++)
		{
			totalRent += properties[i].getRentAmount();
		}
		
		return totalRent;
		
	}
	
	/**
	 * Gets the property in the array with the maximum amount of rent
	 * @return the property with the highest amount of rent
	 */
	public Property getHighestRentPropperty()
	{
		Property max;
		max = properties[0];
		double maxRent = properties[0].getRentAmount();
		
		for(int i = 0; i < numOfProperties; i++)
		{
			if(properties[i].getRentAmount() >= maxRent)
				max = properties[i];
		}
		
		return max;
		
	}
	
	/**
	 * Checks if the management company has a valid (between 0-100) fee
	 * @return true of the management fee is valid (between 0-100), false otherwise
	 */
	public boolean isMangementFeeValid()
	{
		boolean valid = false;
		
		if(this.mgmFee < 0 || this.mgmFee > 100)
			valid = false;
		else
			valid = true;
		
		return valid;
	}
	
	// The following is the toString method
	
	@Override
	public String toString()
	{
		String props = "";
		
		for(int i = 0; i < numOfProperties; i++)
		{
		      props += properties[i] + "\n"; 
		}
		
		    return "List of the properties for " + name + ", taxID: " + taxID
		        + "\n_________________________________________________\n"
		        + props +  "_________________________________________________\n"
		        + "total management Fee: " + (getTotalRent() * mgmFee / 100);
		

	}
	
	

}
