/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infotourisme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ameni Hamdi
 */
public class InfoTourismeBD {
    
    

    private static InfoTourismeBD instance;
    private Connection cnx;
    
    String url = "jdbc:mysql://localhost:3306/infotourisme";

    private InfoTourismeBD() {
        System.out.println("Instantiation de CNX");
        try {
            cnx = DriverManager.getConnection(url, "root", "");
            System.out.println("Connexion établie");
        } catch (SQLException ex) {
            System.err.println("Connexion impossible");
            System.err.println(ex);
        }
    }

    public static InfoTourismeBD getInstance() {
        if (instance == null) {
            instance = new InfoTourismeBD();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return cnx;
    }

}

