package heap;

import javax.swing.*;
import java.io.*;

class ArbolHeap{
	// Arreglo en el cual se almacenan los elementos.
	int[] llave;
	// Posición en la cual se va a insertar.
	int posicion;
	
	//Contructor
	public ArbolHeap(){
		llave = new int[10];
		posicion = 0;
	}
	
	//Obtiene el hijo derecho según la posicion del padre
	public int hDer(int posPadre){
		return (2 * posPadre) + 1;
	}
	
	//Obtiene el hijo izquierdo según la posicion del padre
	public int hIzq(int posPadre){
		return (2 * posPadre);
	}
	
	//Inserta un elemento dentro del arbol de Heap.
	public void inserta(int nLlave){
		int padre;
		int auxiliar;
		int siguiente;
		siguiente = posicion;
		padre = (siguiente / 2);
		if(padre < 0)
			padre = 0;
		llave[siguiente] = nLlave;
		// se acomodan los elementos para que el padre sea mayor que cualquiera de los hijos.
		while((siguiente != 0) && (llave[padre] <= llave[siguiente])){
			auxiliar = llave[padre];
			llave[padre] = llave[siguiente];
			llave[siguiente] = auxiliar;
			siguiente = padre;
			padre = (siguiente / 2);
		}
		posicion++;
	}
	
	//Ordena el árbol de manera que quede en una cola de prioridad.
	public void HeapSort(){
		int padre, hijo, llaveAnterior;
		int ultima = posicion-1;				
		for(int i = 10; i >= 1;i--){	
			llaveAnterior = llave[ultima];
			llave[ultima] = llave[0];
			ultima = ultima - 1; 
			padre = 0;
			if((ultima >= 2) && (llave[2] > llave[1]))
				hijo = 2;	
			else
				hijo = 1;
			while((hijo <= ultima) && (llave[hijo] > llaveAnterior)){
				llave[padre] = llave[hijo];
				padre = hijo;
				hijo = padre * 2;
				if(((hijo + 1) <= ultima) && (llave[hijo + 1] > llave[hijo]))
					hijo++;	
				this.mostrar();
				
			}
			llave[padre] = llaveAnterior;
			this.mostrar();
		}
	}
	
	public void  mostrar(){
		
		
		for(int i=0;i<posicion;i++){
			System.out.print(" "+llave[i]+" ");
		}
		
		
	
		
	}
	
}