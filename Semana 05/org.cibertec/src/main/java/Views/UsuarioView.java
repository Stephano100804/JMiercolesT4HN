package Views;

import controllers.UsuarioController;

public class UsuarioView {
	
	public static void main(String[] args) {
		//String usuario= new UsuarioController().createUsuario("Renzo", "Cueva", "Lima");
		//System.out.println(usuario);
		
		String buscaUsu= new UsuarioController().GetUsuario(1);
		System.out.println(buscaUsu);
	}
}
