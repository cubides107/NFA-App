package Views.Models;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author Sebastian Felipe Martinez Samaca 
 * @descprtion Esta clase es un modelo de Jmenu
 * @date 20/06/2020
 */
public class JModelMenu extends JMenu{

	/**
	 * @description Constructor con 3 parametros
	 * @param text
	 * @param backGround
	 * @param font
	 */
	public JModelMenu(String text, Color backGround, Font font) {
		super(text);
		this.setBackground(backGround);
		this.setFont(font);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setForeground(Color.white);
		setBorderPainted(false);
		setFocusable(false);
	}
	
	/**
	 * @description Un constructor con 4 parametros
	 * @param text // texto
	 * @param backGround
	 * @param foreGround
	 * @param font
	 */
	public JModelMenu(String text, Color backGround, Color foreGround, Font font) {
		super(text);
		this.setBackground(backGround);
		this.setForeground(foreGround);
		this.setFont(font);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setForeground(Color.white);
		setBorderPainted(false);
		setFocusable(false);
	}

	public JModelMenu(String text, String imgPath, Color backGround, Color foreGround, Font font, int width, int height) {
		super(text);
		ImageIcon image = new ImageIcon(getClass().getResource(imgPath));
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setForeground(Color.white);
		setBorderPainted(false);
		setFocusable(false);
		this.setIcon(icon);
		this.setBackground(backGround);
		this.setForeground(foreGround);
		this.setFont(font);
	}

}
