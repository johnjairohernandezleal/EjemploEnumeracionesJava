/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenumeraciones;

import static ejemploenumeraciones.EjemploEnumeraciones.indicarPaises;

/**
 *
 * @author john hernandez
 */
public class EjemploEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // VALORES DE LA ENUMERACION
        System.out.println("Valor 1:" + Dias.LUNES);
        
        /**
         * hacemos un test del dia utilizado
         */
        indicarDia(Dias.VIERNES);
        /**
         * utilizamos la enumeracion de paises
         */
        System.out.println("continente no 4 :" + Continentes.AMERICA);
        System.out.println("Paises en America :" + Continentes.AMERICA.getPaises());
        
        /**
         * hacemos el tes del numero de paises por continente
         */
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        indicarPaises(Continentes.AMERICA);
        indicarPaises(Continentes.ASIA);
        indicarPaises(Continentes.EUROPA);
        indicarPaises(Continentes.OCEANIA);
        
        /**
         * imprimimos los continentes
         */
        System.out.println("");
        imprimirContinentes();
        
    }
    
    public static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("quinto dia de la semana");
                break;
                
            case SABADO:
                System.out.println("penultimo dia de la semana");
                break;
            case DOMINGO:
                System.out.println("ultimo dia de la semana");
                break;
            default :
                System.out.println(" dia inexistente");
                        
        }
    }
    
    public static void indicarPaises(Continentes continentes){
        switch(continentes){
            case AFRICA:
                System.out.println("N°. Paises en :" + continentes + ":" + continentes.getPaises());
                break;
            case AMERICA:
                System.out.println("N°. Paises en :" + continentes + ":" + continentes.getPaises());
                break;
            case EUROPA:
                System.out.println("N°. Paises en :" + continentes + ":" + continentes.getPaises());
                break;
            case ASIA:
                System.out.println("N°. Paises en :" + continentes + ":" + continentes.getPaises());
                break;
            case OCEANIA:
                System.out.println("N°. Paises en :" + continentes + ":" + continentes.getPaises());
                break;
                default :
                System.out.println(" pais inexistente");
                
                
                
                        
        }
    }
    
    public static void imprimirContinentes(){
        // utilizamos un foreach
        for(Continentes c :Continentes.values()){
            System.out.println("Continente : " + c + "continene" + c.getPaises()+ "paises.");
        }
    }
    
}
