
package edu.tesji.radiobutton.modelo;

public class FabricaModel {
    private String Nclave;
    private double materiaPrima;
    public String Precio(){
        double costosProduccion;
        double manoObra=0;
        double gastosFabricacion=0;
        double precioVenta=0;
        //maono de obra
        if(Nclave=="Clave 3"||Nclave=="Clave 4"){
            manoObra=materiaPrima*.75;
        }else if(Nclave=="Clave 1"||Nclave=="Clave 5"){
            manoObra=materiaPrima*.80;
        }else if(Nclave=="Clave 2"||Nclave=="Clave 6"){
            manoObra=materiaPrima*.85;
        }
        //gastos fabricacion
        if(Nclave=="Clave 2"||Nclave=="Clave 5"){
            gastosFabricacion=materiaPrima*.30;
        }else if(Nclave=="Clave 3"||Nclave=="Clave 6"){
            gastosFabricacion=materiaPrima*.35;
        }else if(Nclave=="Clave 1"||Nclave=="Clave 4"){
            gastosFabricacion=materiaPrima*.28;
        }
        costosProduccion=materiaPrima+manoObra+gastosFabricacion;
        precioVenta=costosProduccion+(costosProduccion*.45);   
        return "El precio de venta final es "+precioVenta;
    } 
    
    public String getNclave() {
        return Nclave;
    }

    public double getMateriaPrima() {
        return materiaPrima;
    }

    public void setNclave(String Nclave) {
        this.Nclave = Nclave;
    }
    
    public void setMateriaPrima(double materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
}
