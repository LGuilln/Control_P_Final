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
public class HTML implements Serializable{

    int No;
    String nombre;
    String v1;
    String v2;
    String v3;
    String salida;
    String filatxt;
    String cola;
    
    public  HTML(){
    }
    public void generarEncabezado(String Titulo){
        salida = "<html>\n";
        salida = "\n<tr>\n";
        salida +="<td>+p1+<td\n>";
        salida+="<tr>\n";
    }
    
    public void generarpestania(String p1,String p2, String p3, String p4){
        salida+="<td><strong>"+p1+"</strong></td>\n";
        salida+="<td><strong>"+p2+"</strong></td>\n";
        salida+="<td><strong>"+p3+"</strong></td>\n";
        salida+="<td><strong>"+p4+"</strong></td>\n";
        salida+="<tr>";
    }
    
    public void generarFilaHTML(String p1, String p2, String p3){
        filatxt="";
        filatxt="\n<tr>\n";
        filatxt+="<td><strong>"+p1+"</strong></td>\n";
        filatxt+="<td><strong>"+p2+"</strong></td>\n";
        filatxt+="<td><strong>"+p3+"</strong></td>\n";
        filatxt+="</tr>\n";
    }
    public void generarCola(){
        cola+="\n</table>\n";
        cola+="</body>\n";
        cola+="</html>\n";
    }
    
    
}
