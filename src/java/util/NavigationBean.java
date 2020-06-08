
package util;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author casper
 */
@Named
@SessionScoped
public class NavigationBean implements Serializable {
    public String page(String p){
       
        
        return "/module/"+p+"/"+p+"?faces-redirect=true";
    }
}
