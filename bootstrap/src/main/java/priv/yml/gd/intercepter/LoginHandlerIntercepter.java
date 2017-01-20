package priv.yml.gd.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import priv.yml.gd.Constants;

/**
 * 登录拦截器
 * @author Administrator
 *
 */
public class LoginHandlerIntercepter implements HandlerInterceptor {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		logger.info("afterCompletion...");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2) throws Exception {

		String requestURL = request.getRequestURI();
		
		HttpSession session = request.getSession();  
        String username = (String) session.getAttribute(Constants.USERNAME);  
        if(username!=null){  
        	if(requestURL.endsWith("showloginpage") || requestURL.endsWith("login") || requestURL.endsWith("/bootstrap/")){
        		request.getRequestDispatcher("/showhomepage").forward(request,arg1);
        		return false;
        	}else{
        		return true;
        	}
        }else if(username == null && (requestURL.endsWith("showloginpage") || requestURL.endsWith("login"))){
        	return true;
        }else{
        	request.getRequestDispatcher("/showloginpage").forward(request,arg1);  
            return false;  
        }
	}

}
