/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import psw1bancodedadosexercicio2.Materia;

/**
 *
 * @author alexandretorres
 */
public class DerbyMateriaDAO extends MateriaDAO{
    
    private final Connection conn;

    public DerbyMateriaDAO(){
        DAOFactory dao = DAOFactory.getDAOFactory( DAOFactory.DERBY );
        this.conn = dao.getConnection();
    }
      
}
