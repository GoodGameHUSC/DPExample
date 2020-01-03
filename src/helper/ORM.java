package helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class ORM {

    protected String tableName;

    public ORM(String tableName) {
        // TODO Auto-generated constructor stub
        this.tableName = tableName;
    }

    public ArrayList<Bean> all() {
        ArrayList<Bean> result = new ArrayList<Bean>();
        try {
            String sqlClause = String.format("Select * from %s", this.tableName);
            System.out.println(sqlClause);

            Connection conn = DatabaseConnector.getConnection();

            Statement statementSql = conn.createStatement();
            ResultSet queryResult = statementSql.executeQuery(sqlClause);

            while (queryResult.next()) {
                result.add(this.tranform(queryResult));
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return result;
    }

    public abstract void insert(Bean object);

    public abstract int update(Long objectId, Bean object);

    public int removeById(String objectId, String idColumn) {
        try {
            Connection conn = DatabaseConnector.getConnection();

            String sqlClause = "";
            Statement statementSql = conn.createStatement();
            if(idColumn == null) idColumn = "id";
            sqlClause = String.format("Delete from %s where %s = %d ", this.tableName, idColumn, objectId);
            System.out.println(sqlClause);

            statementSql = conn.createStatement();
            return statementSql.executeUpdate(sqlClause);
        } catch (

        Exception e) {
            e.printStackTrace();
            return 0;
            // TODO: handle exception
        }
    }

    public abstract Bean tranform(ResultSet queryResult) throws SQLException;
}
