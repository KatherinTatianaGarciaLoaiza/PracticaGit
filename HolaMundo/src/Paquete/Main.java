package Paquete;
//import java.io.*; este es para capturar texto desde el teclado
class Main {
	/** 
	 * Operadores logicos <, >, <=, >=, ==, ||, &&, != 
	 * @param args
	 */
	public static void main(String[] args) {
		//int num, resultado;
		
		//num = 25;
		
		//resultado = num + 24;
		
		//String texto = "";                           este es para capturar texto del teclado
		
		//int x = 0;
		//inputStreamReader in = new InputStreamReader(System.in);                es para abrir un canla de datos para atrapar del teclado
		//BufferedReader buffer = new BufferedReader(in);                  almacena los datos que ingresaron al canal
		//try {
		//	texto = buffer.readLine();                                 se almacena lo que hay en la variable de texto
		//	x = Integer.parseInt(texto)para int; Double.parseDouble(texto) para double;							para pasar e sstring a entero
		//}catch (IOException e){};                              se utiliza porque pueden ocurrir errores de captura desde el teclado
		//}catch (Exception e){
		//System.out.println("debes escribir un numero");
		//};                              se utiliza porque pueden ocurrir errores de captura desde el teclado
		//texto = texto.concat("-esto es una concatenacion"); 
		//texto = texto.toLowerCase();                           para pasar a minuscula
		//texto = texto.toUpperCase();                           para pasar a mayuscula 
		//texto = String.valueOf(x);   				para de int o double a string 
		
		//System.out.println("El resultado es: "+resultado);
		
		// if (-){}
		//else{}
		
		//while(-){}
		//continue, vuelve al iniciodel ciclo conservando el 
		//valor actual pero no deja ejecutar las demas lineas 
		//de codigo que se encuentran en el ciclo debajo de esta
		
		//switch(-){
		//case -:{}
		//...
		//default:{}
		//}
		
		//PARA LEER ARCHIVOS DE TEXTO
		//import java.io.*;
		//try{
		//FileReader r = new FileReader(NombreDelArchivo);
		//BfferedReader buffer = new BufferedReader(r);  			esto es solo para una la primera linea del archivo
		//PARA EL TEXTO COMPLETO ES
		//String temp = "";
		//while (temp != null){
		//	temp = buffer.readLine();
		//	if (temp == null){
		//		break;
		//		}
		//};
		//}catch(Exception e){
		//	System.out.println(e.getMessage()// no se pudo obtener el archivo de texto);
		//};
		
		
		//Arreglos ---> int x[][] = new int[10][3] ó para 1 fila{10, 5, 7};
		//x[0][0] = 10;
		//x[0][1] = 5;
		
		// tamaño ---> x.length
		
		//for(int i = 0; i <= 9; i ++)
		//{
		//	System.out.println("El resultado es: "+i);
		//}
		
		//LISTAS ENLAZADAS CON lINKEDlIST NOTA: COMIENZA EN CERO
		//import java.util.LinkedList;
		//	dentro del main va
		// LinkedList listax = new LinkedList();
		//listax.add("Palabra");
		//listax.add(5);
		//listax.add(1, 17); ESTE ES PARA GUARDARLO EN UNA POSICION ESPECIFICA
		//System.out.println("El tamaño de la lista es :"+listax.size());
		//System.out.println(listax.get(2));
		// get.First para el primer elemento; get.last para el ultimo elemento de la lista
		//.addFirst() para agregar de primer elemeto;  .addLast() para agregar de ultimo elemento
		// PARA ELIMINAR UN ELEMENTO DE LA LISTA
		//listax.remove(elemento a eliminar); tambien se puede utilizar el Last o el First
		
		//PARA ESCRIBIR ARCHIVOS DE TEXTO
		//File f = new File(NombreDelArchivo); para crear un objeto de tipo arhivo;
		//try{
		//	FileWriter w = new FileWriter(f); 
		//	BufferedWriter bw = new BufferedWriter (w);
		//	PrintWriter wr =new PrintWriter(bw);
		// 	wr.write("Esto es una linea de texto");
		//	wr.append("\nEsta es una segunda linea de texto"); el \n es para pasar al siguiente renglon
		//	wr.close();
		//	bw.close(); estas dos ultimas lineas son necesarias para que se cree y se guarde el archivo
		//}catch(Exception e){
		// System.out.println("mensaje de error")
		//}
		
		//PILAS SON ESPACIOS DE MEMORIA DONDE VAMOS A GUARDAR DATOS y el primer dato es el ultimo que sale
		//push sirve par aintroducir un dato en la pila
		//pop quitar el ultimo dato que se introdujo en el espacio de memoria
		//peek para ver el ultimo dato de la pila
		//empty es para ver si la pila tiene datos o esta vacia
		//import java.util.Stack;
		//Stack pila = new Stack();
		//pila.push(50);
		//pila.push("String");
		//pila.push(17);
		//pila.push(Palabra);
		//System.out.println("El ultimo elemento en la pila es:"+pila.peek());
		//while(pila.empty() == false){
		//	System.out.println(pila.pop());
		//}
		
		//COLAS, ES UNA VARIACION DE LinkedList
		//offer es para añadir un dato
		//poll es para obtener un dato
		//es un FIFO osea first.in, fisrt out, osea que el primer dato que entra es el primer dato que sale 
		//LinkedList cola = new LinkedList();
		// for (int i = 1; i < 11; i ++){
		//		cola.offer(i);
		//}
		//while(cola.peek() != null){
		//	System.out.println(cola.poll());
		//}
		
		
	}

}
