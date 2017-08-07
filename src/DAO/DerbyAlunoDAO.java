/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author Alexandre.Torres
 */
class DerbyAlunoDAO extends AlunoDAO {
    
    public DerbyAlunoDAO(){
        DAOFactory dao = DAOFactory.getDAOFactory( DAOFactory.DERBY );
        super.setConn(dao.getConnection());
    }
}
