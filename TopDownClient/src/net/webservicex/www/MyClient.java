package net.webservicex.www;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import net.webservicex.www.StockQuoteStub.GetQuote;
import net.webservicex.www.StockQuoteStub.GetQuoteResponse;

public class MyClient {
	public static void main(String args[]) throws AxisFault {
		System.out.println("+.+.+. Start the main .+.+.+.+");
		StockQuoteStub stub = new StockQuoteStub();
		stub._getServiceClient()
				.getOptions()
				.setProperty(Constants.Configuration.TRANSPORT_URL,
						"http://localhost:9763/services/StockQuote/");
		stub._getServiceClient().getOptions()
				.setProperty(HTTPConstants.CHUNKED, Constants.VALUE_FALSE);
		// GetQuote gq = new GetQuote();
		// int x, y, z = 0;
		// x = 25;
		// y = 60;
		// z = x + y;
		// gq.setSymbol(gq.getSymbol() + " IBM " + z);
		// GetQuoteResponse response = new GetQuoteResponse();
		// response.setGetQuoteResult(gq.getSymbol());
	}
}