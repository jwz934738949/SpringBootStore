package cn.edu.sdut.springbootstore.conn;

import cn.edu.sdut.springbootstore.SpringbootstoreApplicationTests;
import org.junit.Test;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestConn extends SpringbootstoreApplicationTests {
    @Resource
    private DataSource dataSource;

    @Test
    public void testConn() throws SQLException {
        Connection connection = this.dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
