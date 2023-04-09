package crm.controller;

import crm.dao.HomePageDAO;
import crm.vo.PotentialLead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class homePageController {
    @Autowired private JdbcTemplate jdbcT;
    @Autowired private HomePageDAO hpDAO;
   @RequestMapping("/")
   public String getHomePage(Model model) {
      List<Map<String, Object>> leads = jdbcT.queryForList("SELECT * FROM POTENTIAL_LEADS");
     model.addAttribute("leads", leads);
     return "index";
   }
    @RequestMapping("/index")
    public String getDataRowMapper(Model model) {
        List<PotentialLead> plList =hpDAO.getListOfAllPLsRowMapper();
        model.addAttribute("leads", plList);
        return "index";
    }

    @RequestMapping("/indexMyBatis")
    public String getDataRowMapperMyBatis(Model model) {
        List<PotentialLead> plList = hpDAO.getListOfAllPLsMyBatis();
        model.addAttribute("leads", plList);
        return "index";
    }

    @RequestMapping("/indexMyBatisPLById")
    public String getPLByIDMyBatis(@RequestParam String plID, Model model) {
        List<PotentialLead> plList = hpDAO.getPLByIdMyBatis(plID);
        model.addAttribute("leads", plList);
        return "index";
    }


}
