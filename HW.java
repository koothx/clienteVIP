package CienteV;

import java.util.Scanner;
public class HW {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		CienteVIP JK = new CienteVIP();
		
		JK.setNombre("Taehyung");
		System.out.println("Nombre:  " + JK.getNombre());
		JK.setLimite_de_Credito("100000");
		System.out.println("LImite de credito:  " + JK.getLimite_de_Credito());
		JK.setCorreo("lachimolala@gmail.com.ni");
		System.out.println("Correo:  " + JK.getCorreo());	
	}

}
