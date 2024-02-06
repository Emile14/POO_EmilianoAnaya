package edu.emiliano_anaya.reto2.promedio.process;

public class CalificacionesPromedio {
    /**
     * el for hace que se recorra el arreglo y suma las calificaciones
     * @param calificaciones son las calificaciones que introdujo el usuario
     * @param cantidadcal es la cantgidad de calificaciones que se van a calcular
     * @return te dara el resultado de la suma entre la cantidad de calificaciones
     */
    public static double promedioCalificaciones(double[] calificaciones,int cantidadcal){
        double suma = 0;
        for(double calificacion : calificaciones){
            suma += calificacion;
        }
        return suma/cantidadcal;
    }
}
