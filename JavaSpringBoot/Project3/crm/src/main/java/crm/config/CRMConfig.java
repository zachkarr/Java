package crm.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
@ComponentScan("crm")

public class CRMConfig {
    @Bean public DataSource datasrc() throws SQLException {
        DataSource ds = new EmbeddedDatabaseBuilder().addScript("classpath:potentialLeads.sql").build();
        ds.getConnection().setAutoCommit(true);
        return ds;
    }
    @Bean public JdbcTemplate getJdbcTemplate() throws SQLException {
        return new JdbcTemplate(datasrc());
    }

}
