package mostrarRepetidos;

import java.util.Scanner;

public class MostrarRepetidos
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];
		boolean encontradoASuIzquierda;
		boolean encontradoASuDerecha;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < numeros.length; i++)
		{
			encontradoASuIzquierda = false;
			for(int j = 0; j < i && !encontradoASuIzquierda; j++)
				if(numeros[i] == numeros[j])
					encontradoASuIzquierda = true;
			if(!encontradoASuIzquierda)
			{
				encontradoASuDerecha = false;			
				for(int j = i + 1; j < numeros.length && !encontradoASuDerecha; j++)
					if(numeros[i] == numeros[j])
						encontradoASuDerecha = true;
				if(encontradoASuDerecha)
					System.out.println(numeros[i]);
			}
		}
	}
}

