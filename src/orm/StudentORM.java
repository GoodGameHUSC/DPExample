package orm;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import helper.DatabaseConnector;
import helper.Bean;
import helper.ORM;

public class StudentORM extends ORM {

    public static void main(String[] args) {
        StudentORM orm = new StudentORM("sinhvien");
        orm.insert(new Student());
    }

    public StudentORM(String tableName) {
        super(tableName);
    }

    @Override
    public void insert(Bean object) {

        Student ob = (Student) object;
        Connection conn;
        try {
            conn = DatabaseConnector.getConnection();

            String sqlClause = String.format("INSERT INTO %s(name) VALUES (?)", this.tableName);

            String generatedColumns[] = { "id" };

            PreparedStatement stmtInsert = conn.prepareStatement(sqlClause, generatedColumns);

            stmtInsert.setString(1, ob.getName());

            int number = stmtInsert.executeUpdate();
            if (number > 0) {
                ResultSet rs = stmtInsert.getGeneratedKeys();

                if (rs.next()) {
                    long id = rs.getLong(1);
                    ob.setId(id);
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    
    @Override
    public int update(Long objectId, Bean object) {
        Student ob = (Student) object;
        Connection conn;
        try {
            conn = DatabaseConnector.getConnection();

            String sqlClause = String.format("UPDATE %s SET name = ? where id = %s", this.tableName);

            PreparedStatement stmtInsert = conn.prepareStatement(sqlClause);

            stmtInsert.setString(1, ob.getName());

            int number = stmtInsert.executeUpdate();
            return number;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }
    }

  
    @Override
    public Bean tranform(ResultSet qr) throws SQLException {
        Student ob = new Student();
        ob.setName(qr.getString("name"));
        return ob;
    }

}
