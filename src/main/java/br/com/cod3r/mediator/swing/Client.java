package br.com.cod3r.mediator.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.cod3r.mediator.swing.components.AddButton;
import br.com.cod3r.mediator.swing.components.Label;
import br.com.cod3r.mediator.swing.components.ResetButton;
import br.com.cod3r.mediator.swing.components.State;
import br.com.cod3r.mediator.swing.mediator.Mediator;

public class Client {
	public static void main(String[] args) {
		Screens screens = new Screens();
		screens.init();
	}
}
