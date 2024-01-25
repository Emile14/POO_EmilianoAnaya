package edu.emiliano_anaya.reto1.process;

/**
 * Esta clase sirve para realizar calculos de
 * calculo de indice de masa corporal
 * Calculo de masa corporal magra
 * Calculo de metabolismo basal
 */
public class CalculadoraMasa {
    /**
     * este metodo sirve para calcular el indice de masa corporal con su peso y estatura al cuadrado
     * @param estatura estatura del paciente en centimetros
     * @param peso peso en kg
     * la variable metros convierte la estatura a metros
     * @return indice de masa corporal
     */
    public static double calcularIndiceMasaCorporal(double estatura, double peso){

        double metros = estatura/100;
        double Imc = peso/Math.pow(metros,2);
        if(Imc <= 18.50)
            System.out.println("Tienes peso bajo");
        else if (Imc <= 24.99)
            System.out.println("Tienes peso normal");
         else if (Imc <= 29.99)
            System.out.println("Tienes sobrepeso");
         else if (Imc <= 34.99)
            System.out.println("Tienes obesidad leve");
         else if (Imc <= 39.99)
            System.out.println("Tienes obesidad media");
         else if (Imc <= 40.00)
            System.out.println("Tienes obesidad morbida");
        /*Math.pow eleva al cuadrado*/
        return Imc;
    }

    /**
     * Este metodo sirve para calcular la masa corporal magra
     * @param peso peso en kilogramos
     * @param estatura en centimetros
     * @param sexo ya sea M de masculino o F de femeninino
     * @return Masa corporal magra
     * se usa el if para declarar si el usuario introduce m o f ya sea en minuscula o mayuscula
     */
    public static double calcularMasaCorporalMagra(double peso, double estatura, char sexo){
        double magra = 0;
        if (sexo == 'm' || sexo == 'M'){
            magra = 1.10*peso-128*Math.pow(peso,2)/Math.pow(estatura,2);
        } else if (sexo == 'f' || sexo == 'F') {
            magra = 1.07*peso-148*Math.pow(peso,2)/Math.pow(estatura,2);
        }else{
            System.out.println("Este valor no existe");
        }
        return magra;
    }

    /**
     * este metodo es para calcular el metabolismo basal
     * @param peso en kilogramos
     * @param estatura estatura en centimetros
     * @param sexo ya sea M de masculino o F de femeninino
     * @param edad es un entero
     * @return Metabolismo basal
     */
    public static  double calcularMetabolismoBasal(double peso, double estatura, char sexo, int edad){
        double basal = 0;
        if (sexo == 'm' || sexo == 'M'){
            basal = 66.5 + 13.75*peso+5.003*estatura-6.775*edad;
        } else if (sexo == 'f' || sexo == 'F') {
            basal = 655.1 + 9.563*peso+1.85*estatura-4.676*edad;
        }else{
            System.out.println("Este valor no existe");
        }
        return  basal;
    }
}
