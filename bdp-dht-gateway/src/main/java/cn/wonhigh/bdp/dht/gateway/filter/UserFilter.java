package cn.wonhigh.bdp.dht.gateway.filter;

import com.netflix.zuul.ZuulFilter;

/**过滤用户，实现安全控制
 * @author Ban
 *
 */
public class UserFilter extends ZuulFilter {
	

	private final String FIlTER_TYPE="pre";
	
	private ICheckToken checkToken=new ICheckToken(){

		@Override
		public boolean validateToken(String Token) {
			// TODO Auto-generated method stub

			if(Token==null||Token.trim().length()<3){
				return false;
			}else{
				return true;
			}
		}
		
	};

	@Override
	public Object run() {
		// TODO Auto-generated method stub
//		RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        //header与body，任何一个地方设置有效token都可。
//        String userToken=request.getHeader("user-token")!=null?request.getHeader("user-token"):request.getParameter("user-token");
//        logger.info("get the token is:"+userToken);
//        //todo, 验证Token
//        if(checkToken.validateToken(userToken)){
//        	ctx.setSendZuulResponse(true);// 对该请求进行路由
//            ctx.setResponseStatusCode(200);
//            ctx.set("success", true);//向下一个过滤器传递信息
//        }else{
//        	ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由
//            ctx.setResponseStatusCode(401);
//            ctx.setResponseBody("{\"result\":\"no authority\"}");// 返回错误内容
//            ctx.set("success", false);
//        }
		System.out.println("过滤器执行。。。");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		System.out.println("进行网关，不需要验证，直接通行");
//		return false;
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FIlTER_TYPE;
	}

}
