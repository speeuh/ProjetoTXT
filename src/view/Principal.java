package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP\\Aula";
		String name = "relatorio.csv";
		
		try {
		//	arqCont.readDir(dirWin);
		//	arqCont.createFile(path, name);
		//	arqCont.readFile(path, name);
			arqCont.openFile(path, name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
