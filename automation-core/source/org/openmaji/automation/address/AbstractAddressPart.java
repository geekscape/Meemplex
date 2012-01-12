/*
 * @(#)AbstractAddressPart.java
 *
 *  Copyright 2004 by Majitek Limited.  All Rights Reserved.
 *
 *  This software is the proprietary information of Majitek Limited.
 *  Use is subject to license terms.
 */

package org.openmaji.automation.address;

/**
 * Represents the smallest distinct portion of an address. Instances of
 * this class are used together to form an AddressSpecification.
 *
 * @author  mg
 * @version 1.0
 */
public abstract class AbstractAddressPart {

	private String name;
	private String description;
	protected String lastErrorMessage = null;
	
  /**
   * Constructs an instance of this part with a given name and description.
   * 
   * @param name  The name of this part
   * @param description  A description of this part
   */
  protected AbstractAddressPart(String name, String description) {
    this.name = name;
    this.description = description;
  }
  
	/**
   * Set the value for this part and return whether or not it was valid.
   * 
   * @param value The value to set this part to
   * @return Whether or not the value was valid
   */
  abstract public boolean set(String value);

	/**
   * Returns the value of this part
   * 
   * @return  The value of this part as a String
   */
  abstract public String get();

	/**
   * Returns the description of this part
   * 
   * @return  The description of this part
   */
  public String getDescription() {
		return description;
	}

  /**
   * Returns the name of this part
   * 
   * @return  The name of this part
   */
	public String getName() {
		return name;
	}
	
	/**
   * Returns the last error generated by the set method.
   * 
   * @return  The last error message
   */
  public String getLastErrorMessage() {
		return lastErrorMessage;
	}

}