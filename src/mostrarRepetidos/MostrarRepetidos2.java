package mostrarRepetidos;

import java.util.Scanner;

public class MostrarRepetidos2
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];
		int[] numerosSinRepetir = new int[4];
		int contSinRepetir = 0;
		boolean repetido;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < numeros.length; i++)
		{
			repetido = false;
			// Buscamos numeros[i] en el resto del array
			for(int j = 0; j < numeros.length && !repetido; j++)
			{
				if(numeros[i] == numeros[j] && i != j)
				{
					repetido = true;
				}
			}
			
			if(repetido)
			{
				// Como el elemento numeros[i] es repetido, hay que mostrarlo
				// pero como puede estar más veces, en vez de mostrarlo
				// lo metemos en un array que no admitirá repetidos.
				repetido = false;
				for(int j = 0; j < contSinRepetir && !repetido; j++)
				{
					if(numeros[i] == numerosSinRepetir[j])
					{
						repetido = true;
					}
				}
				// Si no está repetido, lo guardamos en el array
				if(!repetido)
				{
					numerosSinRepetir[contSinRepetir] = numeros[i];
					contSinRepetir++;
				}
			}
		}
		// Mostramos el contenido del array numerosSinRepetir
		// hasta donde tenga números (contSinRepetir)
		for(int i = 0; i < contSinRepetir; i++)
		{
			System.out.println(numerosSinRepetir[i]);
		}
	}
}
