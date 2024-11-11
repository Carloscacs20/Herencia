package udla.carlosc.herencia;

import com.sun.security.jgss.GSSUtil;

public class PrincipalHerencia {
    public static void main(String[] args) {
        Persona people = new Persona();


       Alumno alumno = new Alumno();
       alumno.setNombre("Julio");
       alumno.setApellido("Jaramillo");
       alumno.setCarrera("Ing. Software");
       alumno.setEdad(22);
       alumno.setNotap1(70);
        System.out.println("Datos del alumno");
        System.out.println("Nombre y Apellido: " + alumno.getNombre() + "-" + alumno.getApellido());

        AlumnoInternacional alumnint = new AlumnoInternacional();
        
        Profesor prof = new Profesor();

    }
}
