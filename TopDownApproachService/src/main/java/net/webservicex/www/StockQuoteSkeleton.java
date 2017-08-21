/**
 * StockQuoteSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v14  Built on : Jul 25, 2015 (11:19:54 IST)
 */
package net.webservicex.www;

/**
 * StockQuoteSkeleton java skeleton for the axisService
 */
public class StockQuoteSkeleton {

	/**
	 * Auto generated method signature Get Stock quote for a company Symbol
	 * 
	 * @param getQuote
	 * @return getQuoteResponse
	 */

	public net.webservicex.www.GetQuoteResponse getQuote(
			net.webservicex.www.GetQuote getQuote) {
		int x, y, z = 0;
		x = 25;
		y = 60;
		z = x + y;
		getQuote.setSymbol(getQuote.getSymbol() + " IBM " + z);
		GetQuoteResponse response = new GetQuoteResponse();
		response.setGetQuoteResult(getQuote.getSymbol());
		return response;
	}

}
