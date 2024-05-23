package bankApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Main {

	 public static void main(String[] args) {
	        SignIn FsignIn = new SignIn();
	        FsignIn.setVisible(true);
	        FsignIn.setUndecorated(true);
	        
	        SignUp2 FsignUp = new SignUp2();
			FsignUp.setVisible(true);
	    }
}
