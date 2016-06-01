	
	package com.infy.converter;
	
	import javax.faces.component.UIComponent;
	import javax.faces.context.FacesContext;
	import javax.faces.convert.Converter;
/**
 * This class implements Converter interface for creating custom converter.
 */
	public class CurrencyConverter implements Converter{
		//This method converts amount from dollar(String) to INR(Object)(assuming 1 dollar = 50 INR)
		public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
			Double dollar = Double.parseDouble(arg2);
			Double rs = dollar * 50;
			return rs;
		}
		public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
			return null;
		}
	
	}
