package mx.maleficarum.model;

import javax.faces.context.FacesContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

public class SpringBean {
    
    private ApplicationContext ctx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance()); 
    
    
    public SpringBean() {
        super();
    }
    
    public String getText() {
        return "Test";
    }
}
