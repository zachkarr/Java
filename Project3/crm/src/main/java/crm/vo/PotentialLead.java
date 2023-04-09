package crm.vo;

public class PotentialLead
{
    private String id;
    private String ageOfBusiness;
    private String city;
    private String company;
    private String convertedDate;
    private String convertedLeadId;
    private String country;
    private String area;
    private String employeeCount;
    private String industry;
    private String phone;

    public String getArea()
    {
        return area;
    }

    public String getEmployeeCount()
    {
        return employeeCount;
    }

    public String getIndustry()
    {
        return industry;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPotentialLeadLocationLatitidue()
    {
        return potentialLeadLocationLatitidue;
    }

    public String getPotenitalLeadLocationLongitude()
    {
        return potenitalLeadLocationLongitude;
    }

    public String getSector()
    {
        return sector;
    }

    public String getStatus()
    {
        return status;
    }

    public String getStreet()
    {
        return street;
    }

    public String getWebsite()
    {
        return website;
    }

    public String getZipcode()
    {
        return zipcode;
    }

    private String potentialLeadLocationLatitidue;
    private String potenitalLeadLocationLongitude;
    private String sector;

    public void setArea(String area)
    {
        this.area = area;
    }

    public void setEmployeeCount(String employeeCount)
    {
        this.employeeCount = employeeCount;
    }

    public void setIndustry(String industry)
    {
        this.industry = industry;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setPotentialLeadLocationLatitidue(String potentialLeadLocationLatitidue)
    {
        this.potentialLeadLocationLatitidue = potentialLeadLocationLatitidue;
    }

    public void setPotenitalLeadLocationLongitude(String potenitalLeadLocationLongitude)
    {
        this.potenitalLeadLocationLongitude = potenitalLeadLocationLongitude;
    }

    public void setSector(String sector)
    {
        this.sector = sector;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }

    private String status;
    private String street;
    private String website;
    private String zipcode;

    public String getId()
    {
        return id;
    }

    public String getAgeOfBusiness()
    {
        return ageOfBusiness;
    }

    public String getCity()
    {
        return city;
    }

    public String getCompany()
    {
        return company;
    }

    public String getConvertedDate()
    {
        return convertedDate;
    }

    public String getConvertedLeadId()
    {
        return convertedLeadId;
    }

    public String getCountry()
    {
        return country;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setAgeOfBusiness(String ageOfBusiness)
    {
        this.ageOfBusiness = ageOfBusiness;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public void setConvertedDate(String convertedDate)
    {
        this.convertedDate = convertedDate;
    }

    public void setConvertedLeadId(String convertedLeadId)
    {
        this.convertedLeadId = convertedLeadId;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
