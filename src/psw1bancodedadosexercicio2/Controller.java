/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psw1bancodedadosexercicio2;

import DAO.AlunoDAO;
import DAO.DAOFactory;
import DAO.DerbyMateriaDAO;
import DAO.MateriaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alexandretorres
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AlunoDAO alunoDAO = AlunoDAO.
                AlunoDAOFactory( AlunoDAO.DERBY );
        
        Aluno a = new Aluno(23242526, "Zé das Couves");
        
        alunoDAO.insert(a);
        
        alunoDAO.close();
    }
    
}
