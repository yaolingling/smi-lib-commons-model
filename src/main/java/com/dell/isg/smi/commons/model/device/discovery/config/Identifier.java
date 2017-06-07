/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.device.discovery.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The Class Identifier.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text" })
public class Identifier {

	/** The text. */
	@JsonProperty("text")
	private String text;

	/**
	 * No args constructor for use in serialization.
	 */
	public Identifier() {
	}

	/**
	 * Instantiates a new identifier.
	 *
	 * @param text
	 *            the text
	 */
	public Identifier(String text) {
		super();
		this.text = text;
	}

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	@JsonProperty("text")
	public String getText() {
		return text;
	}

	/**
	 * Sets the text.
	 *
	 * @param text
	 *            the new text
	 */
	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(text).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Identifier) == false) {
			return false;
		}
		Identifier rhs = ((Identifier) other);
		return new EqualsBuilder().append(text, rhs.text).isEquals();
	}

}
