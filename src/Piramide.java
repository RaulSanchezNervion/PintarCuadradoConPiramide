
public class Piramide {

	public static void main(String[] args) {
		printPiramide(2,'*');//Prueba con 2
		System.out.println();
		System.out.println();
		printPiramide(9,'*');//Prueba con 9
		System.out.println();
		System.out.println();
		printPiramide(4,'*');//Prueba con 4

	}

	//Precondición: niveles debe ser un numero entre 2 y 9
	//Postcondicion: muestra por la salida estandar (la pantalla), el cuadrado, según las especificaciones
	//del ejercicio 9, rellenando los espacios laterales con caracter, y pintando tantas filas como 
	//indique el parametro niveles, si caracter es imprimible.
	//Entradas: niveles y caracter
	//Salida: Nada
	private static void printPiramide(int niveles, char caracter) {
		if(esCaracterImprimible(caracter)) {//En el caso del que caracter proporcionado sea imprimible
			for(int nivel=1;nivel<=niveles;nivel++) { //Recorremos todasa las filas
				pintarFila(nivel,niveles,caracter); //Imprimimos cada fila
			}
			imprimeUltimaFila(caracter, niveles);//Imprimimos la ultima fila
		}
	}

	//Precondición: nivel y niveles debe ser un numero entre 2 y 9, caracter imprimible y nivel debe ser menor que niveles
	//Postcondicion: imprime en la salida estandar (la pantalla), la fila correspodiente al
	//nivel indicado por el parametro nivel, para un cuadrado con un numero de filas indicado por 
	//el parametro niveles. Es decir, niveles indica el tamaño del cuadrado
	//Entradas: nivel, niveles y caracter
	//Salida: Nada
	private static void pintarFila(int nivel, int niveles, char caracter) {
		pintarLado(nivel, niveles, caracter);//Dibuja el lado izquierdo
		pintarNumeros(nivel,niveles,caracter);//Dibuja los numeros del centro
		pintarLado(nivel, niveles, caracter);//Dibuja el lado derecho
		System.out.println();//Salto de linea
	}


	//Precondición: nivel y niveles debe ser un numero entre 2 y 9, caracter imprimible  y nivel debe ser menor que niveles
	//Postcondicion: imprime la piramide de numeros, que van incrementandose desde 1 hasta el nivel,
	// y posteriormente decrementandose hasta 1
	//Entradas: nivel, niveles y caracter
	//Salida: Nada
	private static void pintarNumeros(int nivel, int niveles, char caracter) {
		pintarSucesionIncremento(1,nivel);//Pinta desde el 1 hasta el numero nivel
		pintarSucesionDecremento(nivel-1,1);//Pinta desde nivel-1 hasta 1 (decrementandose)
	}

	//Precondición: fin tiene que ser menor que inicio
	//Postcondicion: imprime la sucesión (decrementandose) de numeros desde inicio hasta fin
	//Entradas: inicio, y fin
	//Salida: Nada
	private static void pintarSucesionDecremento(int inicio, int fin) {
		for(int i=inicio;i>=fin;i--) {//Vamos decrementando i desde inicio hasta fin
			System.out.print(i);//Imprimimos el numero
		}

	}

	//Precondición: fin tiene que ser mayor que inicio
	//Postcondicion: imprime la sucesión de numeros desde inicio hasta fin
	//Entradas: inicio, y fin
	//Salida: Nada
	private static void pintarSucesionIncremento(int inicio, int fin) {
		for(int i=inicio;i<=fin;i++) {//Vamos incrementando i desde inicio hasta fin
			System.out.print(i);//Imprimimos el numero
		}

	}

	//Precondición: niveles debe ser un numero entre 2 y 9, caracter imprimible y nivel debe ser menor que niveles
	//Postcondicion: se imprime los caracteres laterales para un cuadrado del tamaño indicado por niveles, para la
	//fila determinada por el parametro nivel
	//Entradas: nivel, caracter y niveles
	//Salida: Nada
	private static void pintarLado(int nivel, int niveles, char caracter) {
		int ancho=niveles-nivel+1;//El numero de caracter de un lado, viene determinado por esta formula
		for(int i=1;i<=ancho;i++)//Segun el ancho indicado
			System.out.print(caracter);//imprime el numero de caracteres
	}

	//Precondición: niveles debe ser un numero entre 2 y 9, y nivel debe ser menor que niveles
	//Postcondicion: se imprime la ultima fila correspondiente a un cuadrado con el tamaño
	// indicado por el parametro niveles
	//Entradas: caracter y niveles
	//Salida: Nada
	private static void imprimeUltimaFila(char caracter, int niveles) {
		int ancho=niveles+niveles-1+2;//El ancho total del cuadrado, viene determinado por esta formula
		for(int i=1;i<=ancho;i++){
			System.out.print(caracter);//Rellenamos el ancho con el caracter
		}

	}

	//Precondición: No tiene
	//Postcondicion: devuelve true si el caracter es imprimible y false en caso contrario
	//Entrada: caracter
	//Salida: boolean
	private static boolean esCaracterImprimible(char caracter) {
		// El metodo está en resguardo
		return true;
	}

}
