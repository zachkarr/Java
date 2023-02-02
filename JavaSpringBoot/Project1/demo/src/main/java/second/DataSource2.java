package second;

import org.springframework.beans.factory.annotation.Autowired;

import first.IS296Controller;

public class DataSource2 {

    @Autowired
    private IS296Controller is296;

    public DataSource2(IS296Controller is296) {
        System.out.println("DataSource2 is instantiated");
        this.is296 = is296;
    }

}
