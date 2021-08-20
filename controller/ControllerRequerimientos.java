package utp.mision2022.c2.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.mision2022.c2.model.dao.RequerimientoDao_1;
import utp.mision2022.c2.model.dao.RequerimientoDao_2;
import utp.mision2022.c2.model.dao.RequerimientoDao_3;
import utp.mision2022.c2.model.vo.Requerimiento_1;
import utp.mision2022.c2.model.vo.Requerimiento_2;
import utp.mision2022.c2.model.vo.Requerimiento_3;

public class ControllerRequerimientos {
    private final RequerimientoDao_1 requerimientoDao_1 = new RequerimientoDao_1();
    private final RequerimientoDao_2 RequerimientoDao_2 = new RequerimientoDao_2();
    private final RequerimientoDao_3 RequerimientoDao_3 = new RequerimientoDao_3();
    
    public ArrayList<Requerimiento_1> consultaRequerimiento_1() throws SQLException{
        return this.requerimientoDao_1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultaRequerimiento_2() throws SQLException{
        return this.RequerimientoDao_2.requerimiento2();
    }
    
    public ArrayList<Requerimiento_3> consultaRequerimiento_3() throws SQLException{
        return this.RequerimientoDao_3.requerimiento3();
    }
    
}
