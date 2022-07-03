package Views.Models;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JModelLabel extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @descprtion Este metodo nos agrega una imagen a un label
	 * @param
	 */
	public JModelLabel(String imagePath) {
		this.setIcon( new ImageIcon(getClass().getResource( imagePath )));
	}

	public JModelLabel(String imagePath, int width, int height) {
		ImageIcon image;
		image = new ImageIcon(getClass().getResource(imagePath));
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
		this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.setIcon(icon);
	}
	
	public JModelLabel(String text, String imagePath, Font font, Color foreground) {
		super(text);
		ImageIcon image;
		image = new ImageIcon(getClass().getResource(imagePath));
		Icon icon = new ImageIcon(image.getImage());
		this.setIcon(icon);
		this.setOpaque(false);
		this.setFont(font);
		this.setForeground(foreground);
		this.setHorizontalTextPosition( SwingConstants.CENTER );
        this.setVerticalTextPosition( SwingConstants.BOTTOM );
	}
	
	public JModelLabel(String text, Color fg, Font font) {
		super(text);
		this.setOpaque(false);
		this.setFont(font);
		this.setForeground(fg);
	}

	public JModelLabel(String text, String imgPath, Font font, Color bg, Color fg, int width, int height){
		super(text);
		ImageIcon imagen = new ImageIcon(getClass().getResource(imgPath));
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
		this.setIcon(icon);
		this.setHorizontalTextPosition( SwingConstants.CENTER );
		this.setVerticalTextPosition( SwingConstants.BOTTOM );
		this.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		this.setFont(font);
		this.setBackground(bg);
		this.setForeground(fg);
	}


	public JModelLabel(String text, Color bg, Color fg) {
		super(text);
		this.setOpaque(true);
		this.setBackground(bg);
		this.setForeground(fg);
	}

	public JModelLabel(String text, Font font, Color bg, Color fg) {
		super(text);
		this.setFont(font);
		this.setOpaque(false);
		this.setBackground(bg);
		this.setForeground(fg);
	}
	
	public JModelLabel(String text, Color bg, Color fg, Font font, Border border) {
		super(text);
		this.setOpaque(true);
		this.setBackground(bg);
		this.setForeground(fg);
		this.setFont(font);
		this.setBorder(border);
	}
	
	public JModelLabel(Icon icon) {
		super(icon);
		this.setOpaque(false);
	}
}
