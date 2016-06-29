package heap;
import java.util.Scanner;
public class Main {
	
	
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);	
		ArbolHeap AH= new ArbolHeap();
		int Opcion,Nodo,Op;
		
		
		
		do{
			System.out.println("1 para ingresar valor");
			System.out.println("2 para mostrar el arbol HeapMax");
			System.out.println("3 para mostrar el arbol HealMin");
			Opcion=scn.nextInt();
			switch(Opcion){
			
			
			case 1://insertar
			System.out.println("ingresa valor a ingresar");
			Nodo=scn.nextInt();
			AH.inserta(Nodo);
			break;
			
			case 2://mostrar
				
			AH.mostrar();
				break;
			
			case 3://imprimir por niveles.
				
			}
			
		
		}while(Opcion >0 && Opcion <3);
		


	}

}
