package Views;

import controllers.UsuarioController;

public class UsuarioViews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuario= new UsuarioController().createUsuario("Rene","Cueva","Lima");
		System.out.println(usuario);
	}
}
