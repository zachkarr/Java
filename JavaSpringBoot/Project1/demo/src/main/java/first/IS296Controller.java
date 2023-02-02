package first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fifith.DataSource;

@Controller
public class IS296Controller {
    @Autowired
    private DataSource ds;

    public IS296Controller(DataSource ds) {
        System.out.println("Controller Instantiated");
        this.ds = ds;

    }

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }
}
