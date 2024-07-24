package Complementarios.ejercicio01;

public class Estudiante {
    String nombre, primer_apellido, segundo_apellido, materia1,materia2,materia3,materia4,materia5;

    public Estudiante(String nombre, String primer_apellido, String segundo_apellido) {
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }
    public void setMateria1(String materia1){
        this.materia1 = materia1;
    }
    public void setMateria2(String materia2){
        this.materia2 = materia2;
    }
    public void setMateria3(String materia3){
        this.materia3 = materia3;
    }
    public void setMateria4(String materia4){
        this.materia4 = materia4;
    }
    public void setMateria5(String materia5){
        this.materia5 = materia5;
    }

    public void getDatos(){
        System.out.println("Hola "+nombre+" "+primer_apellido+" "+segundo_apellido+"\nUsted esta cursando las materias de "+materia1+", "+materia2+ ", "+materia3+", "+materia4+", "+materia5);
    }
}
