package utp.mision2022.c2.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.mision2022.c2.model.vo.Requerimiento_2;
import utp.mision2022.c2.util.JDBCUtilities;

public class RequerimientoDao_2 {
    public ArrayList<Requerimiento_2> requerimiento2 ()throws SQLException{
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta2 = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " + 
                              "l.Nombre ||' '|| l.Primer_Apellido AS 'Nombre Lider', " +
                              "t.Codigo_Tipo, t.Estrato " +
                              "FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " +
                              "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo "  +
                              "WHERE (p.Fecha_Inicio >= '2019-09-01' AND p.Fecha_Inicio <= '2019-09-09'AND p.Ciudad = 'Pereira') ";
            PreparedStatement statement = conexion.prepareStatement(consulta2);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                    resultSet.getString("Fecha_Inicio"),
                    resultSet.getString("Ciudad"),
                    resultSet.getString("Constructora"),
                    resultSet.getString("Nombre Lider"),
                    resultSet.getInt("Codigo_Tipo"),
                    resultSet.getInt("Estrato")
                );

                respuesta.add(requerimiento_2);
                
            }
            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.out.println("Error en la consulta SQL Requerimiento 2 ->" + e);

        }finally {
            if (conexion != null){
                conexion.close();
            }
        }

        return respuesta;
    }

       
    
}

