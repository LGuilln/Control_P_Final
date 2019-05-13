/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import clases.Persona;

/**
 *
 * @author luedu
 */
public class HTML_B implements Serializable{

    public int No;
    public String nombre;
    public String v1;
    public String v2;
    public String v3;
    public String salida;
    public String filatxt;
    public String cola;
    
    public  HTML_B(){
    }
    
    public void generarEncabezado(String Titulo){
        salida = "<html>\n";
        salida+="<head><title>"+Titulo+"</title></head>\n"+"<body>\n";
        salida+="<h1>"+Titulo+"</h1>\n"+"<table>\n";
        salida+="<tr>\n";
    }
    
    public void generarpestania(String p1,String p2, String p3, String p4){
        salida+="<td><strong>"+p1+"</strong></td>\n";
        salida+="<td><strong>"+p2+"</strong></td>\n";
        salida+="<td><strong>"+p3+"</strong></td>\n";
        salida+="<td><strong>"+p4+"</strong></td>\n";
        salida+="</tr>";
    }
    
    public void generarFilaHTML(String p1, String p2, String p3,String p4){
        filatxt="";
        filatxt="\n<tr>\n";
        filatxt+="<td>"+p1+"</td>\n";
        filatxt+="<td>"+p2+"</td>\n";
        filatxt+="<td>"+p3+"</td>\n";
        filatxt+="<td>"+p4+"</td>\n";
        filatxt+="</tr>\n";
    }
    public void generarCola(){
        cola+="\n</table>\n";
        cola+="</body>\n";
        cola+="</html>\n";
    }
    
    
}
