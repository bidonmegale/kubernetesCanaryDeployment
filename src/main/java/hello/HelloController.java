package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {



    @RequestMapping("/get")
    public String getSession() throws Exception {
        return  "EU SOU A V2" + InetAddress.getLocalHost().getHostName();
    }
    
    
    @RequestMapping("/healthz")
    public String healthz() throws Exception {
    	System.out.println("Fui chamado"); 
        return  "OK";
    }

}
