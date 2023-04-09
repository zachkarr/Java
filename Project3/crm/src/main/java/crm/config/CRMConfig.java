package crm.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
@ComponentScan("crm")
@MapperScan("crm.mapper")

public class CRMConfig {
    @Bean public DataSource datasrc() throws SQLException {
        DataSource ds = new EmbeddedDatabaseBuilder().addScript("classpath:potentialLeads.sql").build();
        ds.getConnection().setAutoCommit(true);
        return ds;
    }
    @Bean public JdbcTemplate getJdbcTemplate() throws SQLException {
        return new JdbcTemplate(datasrc());
    }

    @Bean public SqlSessionFactory sqlSessionFactory() throws Exception
    {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setTypeAliasesPackage("crm.vo");
        sessionFactory.setDataSource(datasrc());
        return sessionFactory.getObject();
    }

}
