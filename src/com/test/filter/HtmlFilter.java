package com.test.filter;

public class HtmlFilter implements Filter{

	@Override
	public void doFliter(StringPO req, StringPO resp, FilterChain fc) {
		// TODO Auto-generated method stub
		
		System.out.println("--------html-------");
		  req.req = req.getReq().replace("<", "&lt;").replace(">", "&gt;");
		  System.out.println("--------"+req+"-------");
		  fc.doFilter(req, resp);
		  resp.resp+="-html-";
	}

}
