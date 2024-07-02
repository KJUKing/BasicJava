package kr.or.ddit.study06.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

    private static Connection conn = null;

    public static Connection getConnection() {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        //옆사람 오라클 접속하고싶을때는 그사람의 ip를적으면됨 localhost대신

        //본인 오라클 계정
        String user = "JU";
        String pass = "java";

        if (conn == null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, pass);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return conn;
    }
}
