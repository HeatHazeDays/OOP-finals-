package bankApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Main {

	 public static void main(String[] args) {
	        SignIn frame = new SignIn();
	        frame.setVisible(true);
	        frame.setUndecorated(true);
	    }
}
