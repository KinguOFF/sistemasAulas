/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

/**
 *
 * @author u09285835112
 */

public abstract class DAO_Abstract {
    protected Connection cnt;
    public DAO_Abstract() {
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user, pass;
            url = "jdbc:mysql://10.7.0.51:33062/db_luca_fujii";
            user = "luca_fujii";
            pass = "luca_fujii";
            //url = "jdbc:mysql://localhost:3306/db_luca_fujii?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            //user = "root";
            //pass = "seiki";
            cnt = DriverManager.getConnection(url, user, pass);
            }  
        catch (ClassNotFoundException ex) {
            System.out.println("Error Class" + ex.getMessage());
            System.exit(0);
        }
        catch (SQLException ex) {
            System.out.println("Erro SQL" + ex.getMessage());
            System.exit(0);
            }
}
   
    public abstract void insert(Object object);
    public abstract void update(Object object);
    public abstract void delete(Object object);
    public abstract Object list(int codigo);
    public abstract ArrayList listAll();
}
