import java.util.Scanner;
public class T3 {

	public static void main (String args[]){
	Scanner lea=new Scanner(System.in);
	int numero=0;
	int numero1=0;
	int numero2=0;
	while(numero1<10){
		System.out.println("Ingrese un numero: ");
		numero=lea.nextInt();
		numero2+=numero;
		numero1++;

	}
		System.out.println("promedio= "+numero2/numero1);
	} 
}