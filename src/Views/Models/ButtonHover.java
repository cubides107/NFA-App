package Views.Models;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonHover extends JButton {
	
	//private UploadResources uploadResources;

	private static final long serialVersionUID = 1L;
	private float opacity = 0.5f;

	
	
	
	public ButtonHover(String text, ActionListener actionListener, String command) {
		super(text);
		//uploadResources = new UploadResources();
		addMouseListener(new EventButton());
		setActionCommand(command.toString());
		addActionListener(actionListener);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//setFont(uploadResources.uploadFont(ColorsFonts.OPEN_SANS, 1, 18));
		setForeground(Color.white);	
		setContentAreaFilled(false);
		setBorderPainted(false);
		setFocusable(false);
	}
	
	public ButtonHover(String text, ActionListener actionListener, String command, boolean a) {
		super(text);
		//uploadResources = new UploadResources();
		addMouseListener(new EventButton());
		setActionCommand(command.toString());
		addActionListener(actionListener);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//setFont(uploadResources.uploadFont(ColorsFonts.OPEN_SANS, 1, 18));
		setForeground(Color.white);	
		//setBackground(ColorsFonts.DARK_BLUE);
		setBorderPainted(false);
		setFocusable(false);
	}


	public ButtonHover(String pathIcon, ActionListener actionListener) {
		super();
		addActionListener(actionListener);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addMouseListener(new EventButton());
		this.setIcon(new ImageIcon(getClass().getResource(pathIcon)));
		setFocusable(false);
		setContentAreaFilled(false);
		setBorder(null);
	}
	
	public ButtonHover(String pathIcon) {
		super();
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addMouseListener(new EventButton());
		this.setIcon(new ImageIcon(getClass().getResource(pathIcon)));
		setFocusable(false);
		setContentAreaFilled(false);
		setBorder(null);
	}
	public ButtonHover(String text, boolean bol) {
		super(text);
		setFocusable(false);
		addMouseListener(new EventButton());
		setContentAreaFilled(false);
		setBorder(null);
	}

	public float getOpacity() {
		return opacity;
	}

	public void setOpacity(float opacity) {
		this.opacity = opacity;
		repaint();
	}

	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		super.paintComponent(g2);
	}

	public class EventButton extends MouseAdapter {
		@Override
		public void mouseExited(MouseEvent me) {
			efectHover(1f, 0.5f, 0.03f, 10, false);
		}

		@Override
		public void mouseEntered(MouseEvent me) {
			efectHover(0.5f, 1f, 0.03f, 10, true);

		}

		@Override
		public void mousePressed(MouseEvent me) {
			efectHover(1f, 0.6f, 0.1f, 1, false);
		}

		private void efectHover(float index, float range, float cont, int sleep, boolean event) {
			new Thread(() -> {
				for (float i = index; (event) ? i <= range : i >= range; i = (event) ? i + cont : i - cont) {
					setOpacity(i);
					try {
						Thread.sleep(sleep);
					} catch (InterruptedException e) {
					}

				}
			}).start();
		}
	}

}
