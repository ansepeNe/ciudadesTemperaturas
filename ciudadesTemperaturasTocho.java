package ciudadesTemperaturasTocho;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;
public class ciudadesTemperaturasTocho {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String ciudad = "";
		
		int temperaturaAleatoriaMaxima = 0;
		int temperaturaAleatoriaMinima = 0;
	
		int tempMax = 0;
		int tempMin = 51;
		
		int tempMinMax = 0;
		
		//VARIABLES PARA CALCULAR MEDIAS
		int total = 0;
		
		int mediaMax= 0;
		int mediaMin = 0;

		
		ArrayList temperaturaMax = new ArrayList();
		ArrayList temperaturaMin = new ArrayList();
		
		ArrayList ciudades = new ArrayList();
		
		
		
		
		
		
		do {
			System.out.println("Introduce el nombre de la Ciudad: ");
			ciudad = sc.nextLine();
			
			ciudades.add(ciudad);
			
			if(ciudad.equalsIgnoreCase("fin")) {
				ciudades.remove("fin");
				ciudades.remove("FIN");
				break;
			}
			
			
			
			
			
			temperaturaAleatoriaMaxima = (int)Math.floor(Math.random()*(50+1));
			temperaturaMax.add(temperaturaAleatoriaMaxima);
			
			temperaturaAleatoriaMinima = (int)Math.floor(Math.random()*(temperaturaAleatoriaMaxima+1));
			temperaturaMin.add(temperaturaAleatoriaMinima);
			
			
			
												
			if(temperaturaAleatoriaMaxima > tempMax) {
					
				 tempMax = temperaturaAleatoriaMaxima;
				
			}
			
			if(temperaturaAleatoriaMinima < tempMin){
				tempMin = temperaturaAleatoriaMinima;
				
			}
					
			if(temperaturaAleatoriaMinima > tempMinMax) {
				tempMinMax = temperaturaAleatoriaMinima;
			}
	
			
			//System.out.println(temperaturaAleatoriaMaxima);
			//System.out.println(temperaturaAleatoriaMinima);
			
		}while(!ciudad.equalsIgnoreCase("fin"));
		System.out.println("");
		System.out.println("Temperaturas Maximas Totales: " + temperaturaMax);
		System.out.println("Temperaturas Minimas Totales: " + temperaturaMin);
		System.out.println("");
		System.out.println("La temperatura maxima es: " + tempMax);
		System.out.println("La temperatura minima es: " + tempMin);
		System.out.println("");
		System.out.println("Las ciudades son: " + ciudades);
		
		
		
		//MEDIA DE LAS MAXIMAS
		int i;
		for(i = 0;i<temperaturaMax.size();i++) {
			
			total += (int) temperaturaMax.get(i);
			
			
			
		}
		
		mediaMax = total / i;
		System.out.println("La media de las Maximas es: " + mediaMax);
		
		
		//MEDIA DE LAS MINIMAS
		total = 0;
		for(i = 0;i<temperaturaMin.size();i++) {
			
			total += (int) temperaturaMin.get(i);
			
			
			
		}
		
		mediaMin = total / i;
		System.out.println("La media de las Minimas es: " + mediaMin);
		
		System.out.println("La media de las medias es: " + (mediaMin + mediaMax) / 2);
		
		
		
		
		
		
		//ciudades han registrado una media superior a la mayor 
		//de las minimas
		
		int mediaCiudad = 0;
		System.out.println("");
		System.out.println("Las ciudades que han registrado una media Superior a la mayor de las minimas son: ");
		for(int j = 0;j<ciudades.size();j++) {
			
			//sevilla
			mediaCiudad = ( (int)temperaturaMax.get(j) + (int)temperaturaMin.get(j) ) / 2;
			
			if(mediaCiudad >= tempMinMax) {
				
				System.out.println(ciudades.get(j));
			}
			
			
			
		}
		
		
	
		

	}

}
