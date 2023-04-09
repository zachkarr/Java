package crm.dao;

import crm.mapper.PotentialLeadMapper;
import crm.vo.PotentialLead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class HomePageDAO
{
    @Autowired private JdbcTemplate jdbcT;
    @Autowired private PotentialLeadMapper plm;
    public List<PotentialLead> getListOfAllPLsRowMapper() {
        return jdbcT.query("SELECT * FROM POTENTIAL_LEADS", new RowMapper<PotentialLead>() {
            @Override
            public PotentialLead mapRow(ResultSet rs, int rowNum) throws SQLException {
                PotentialLead pl = new PotentialLead();
                pl.setId(rs.getString("ID"));
                pl.setAgeOfBusiness((rs.getString("AGE_OF_BUSINESS")));
                pl.setCity(rs.getString("CITY").toLowerCase());
                pl.setCompany((rs.getString("COMPANY")));
                pl.setConvertedDate(rs.getString("CONVERTED_DATE"));
                pl.setConvertedLeadId(rs.getString("CONVERTED_LEAD_ID"));
                pl.setCountry(rs.getString("COUNTRY"));
                return pl;
            }
        });
    }

    public List<PotentialLead> getListOfAllPLsMyBatis() {
        return plm.getListOfAllPLs();
    }
    public List<PotentialLead> getListOf5PLsMyBatis() {
        return plm.getListOf5PLs();
    }
    public List<PotentialLead> getLPLByIdMyBatis(String plID) {
        return plm.getPLById();
    }
}
