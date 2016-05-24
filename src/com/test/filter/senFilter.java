package com.test.filter;

public class senFilter implements Filter {

	@Override
	public void doFliter(StringPO req, StringPO resp, FilterChain fc) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------sen---------------");
		 req.req = req.req.replace("敏感", "").replace("被就业", "就业");
		 fc.doFilter(req, resp);
		 resp.resp+="sen";
	}

}
