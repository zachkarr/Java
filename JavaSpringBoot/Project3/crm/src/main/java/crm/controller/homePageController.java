package crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homePageController {
    @Autowired private JdbcTemplate jdbcT;
   @RequestMapping("/")
   public String getHomePage(Model model) {
       model.addAttribute("getData", getData());
       return "index";
   }
    public String getData()  {
       return jdbcT.queryForList("SELECT * FROM POTENTIAL_LEADS").toString();

    }
}
