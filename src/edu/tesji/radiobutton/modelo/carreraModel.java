
package edu.tesji.radiobutton.modelo;

public class carreraModel {
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String VarInfo(){
        String Info="";
        switch(carrera){
            case "Industrial":
               Info = "Evalua los procesos de calidad y produccion ...";
               break;
            case "Informatica":
               Info = "Administrancion sofware ... "; 
               break;
            case "Sistemas":
                Info = "Desarrollador de sofware, base de datos ";
               break; 
               
        }
        return Info;
    } 
}
