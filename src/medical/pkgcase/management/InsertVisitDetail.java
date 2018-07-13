/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.pkgcase.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Vishant
 */
public class InsertVisitDetail 
{

    public InsertVisitDetail(String i, String cc, String o, String d,String  progress,String  addiction,String  appetite,String  thirst,String  desire,String  aversion,String  stool,String  urine,String  perspiration,String  sleep,String  dreams,String  thermally,String  gynac_history,String  mind,String  temp,String  pulse,String  blood_pressure,String  resp_rate,String  others,String  cvs,String  rs,String  cns,String  pa,String  invg_advised,String  miasm,String  susceptibility,String  final_diagnosis,String  probable_remedies) {
        String url = "jdbc:mysql://localhost:3306/medical_case_mgmt?autoReconnect=true&useSSL=false";
        String user = "vjtidev";
        String password = "vjti@123";
        
        String query = "INSERT INTO patient_visit_det (patient_id, chief_complaint, origin, duration, progress, addiction, appetite, thirst, desire, aversion, stool, urine, perspiration, sleep, dreams, thermally, gynac_history, mind, temp, pulse, blood_pressure, resp_rate, others, cvs, rs, cns, pa, invg_advised, miasm, susceptibility, final_diagnosis, probable_remedies ) VALUES (?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?,	?)" ;

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement(query);                      

            //rs = st.executeQuery("SELECT name FROM patient_det");
            
            st.setString(1,i);	
            st.setString(2,cc);
            st.setString(3,o);	
            st.setString(4,d);	
            st.setString(5,progress);	
            st.setString(6,addiction);	
            st.setString(7,appetite);	
            st.setString(8,thirst);	
            st.setString(9,desire);	
            st.setString(10,aversion);	
            st.setString(11,stool);	
            st.setString(12,urine);	
            st.setString(13,perspiration);	
            st.setString(14,sleep);	            
            st.setString(15,dreams);	            
            st.setString(16,thermally);	
            st.setString(17,gynac_history);
            st.setString(18,mind);	                       
            st.setString(19,temp);	
            st.setString(20,pulse);	
            st.setString(21,blood_pressure);	
            st.setString(22,resp_rate);
            st.setString(23,others);	
            st.setString(24,cvs);	            
            st.setString(25,rs);	
            st.setString(26,cns);	
            st.setString(27,pa);	
            st.setString(28,invg_advised);	
            st.setString(29,miasm);	
            st.setString(30,susceptibility);	
            st.setString(31,final_diagnosis);	
            st.setString(32,probable_remedies);
            
            st.executeUpdate();
            System.out.println("Data inserted!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
    }
    
    
}
