package kr.or.ddit.study06.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBService {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public void selectAll(String str) {
        try {

            conn = DBConn.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM MEMBER WHERE MEM_LIKE ='"+str+"'";

            rs = stmt.executeQuery(sql);


            while (rs.next()) {
                // getString ->
                String mid = rs.getString("MEM_ID");
                String mname = rs.getString("MEM_NAME");
                String mlike = rs.getString("MEM_LIKE");
                String madd = rs.getString("MEM_ADD1");
                String mjob = rs.getString("MEM_JOB");


                //scan문 넣어서 조건절도 만들기


            // id name job like 갖고오는데 mem_bir 만나이로 바꿔오기
                System.out.println(mid +"\t"+mname+"\t"+mlike +"\t"+madd+"\t"+mjob);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
