package guia2;

public class Switch1 {
    public static void main(String[] args){
        int a=1;
        int b=1;
        char op='+'; //puede cambiar el operador aritmetico...
        System.out.println("El resultado: ");
        switch (op){
            case '+':
                System.out.println( a + b );
                break;
            case '-':
                System.out.println( a - b );
                break;
            case '*':
                System.out.println( a * b );
                break;
            case '/':
                System.out.println( a / b );
                break;
            default:
                System.out.println("error" );
                break;
        }
    }

}
