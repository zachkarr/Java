package crm.mapper;

import crm.vo.PotentialLead;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PotentialLeadMapper
{

    @Select("SELECT * FROM POTENTIAL_LEADS")
    // MyBatitis is case insensitive. We only have to map the fields that have the underscores
    @Results(id = "plResultMap", value = {
    @Result(property = "ageOfBusiness", column = "AGE_OF_BUSINESS"),
            @Result(property = "EmployeeCount", column = "EMPLOYEE_COUNT"),
            @Result(property = "potentialLeadLocationLatitude", column = "POTENTIAL_LEAD_LOCATION__LATITUDE__S"),
            @Result(property = "potentialLeadLocationLongitude", column = "POTENTIAL_LEAD_LOCATION__LONGITUDE__S"),
            @Result(property = "zipCode", column = "ZIP_CODE")

    })
    public List<PotentialLead> getListOfAllPLs();

    @Select("SELECT * FROM POTENTIAL_LEADS LIMIT 5")
    @ResultMap("plResultMap")
    public List<PotentialLead> getListOf5PLs();

}
