package priv.yml.gd.intercepters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import priv.yml.gd.Constants;

/**
 * 登录拦截器
 * @author Administrator
 *
 */
public class LoginHandlerIntercepter implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2) throws Exception {

		String requestURL = request.getRequestURI();
		//主动请求登录
		if(requestURL.endsWith("login")){
			return true;
		}else{
			HttpSession session = request.getSession();  
            String username = (String) session.getAttribute(Constants.USERNAME);  
            if(username!=null){  
                //登陆成功的用户  
                return true;  
            }else{  
               //没有登陆，转向登陆界面  
                request.getRequestDispatcher("/login").forward(request,arg1);  
              return false;  
            }
		}
		
	}

}
