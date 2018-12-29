package labs;

import java.awt.*;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormAngar {

	private JFrame frame;
	private JPanel panel;
	private JTextField maskedTextBox1;
	Angar<ITransport> angar;
	private MyPanel pictureBoxTakeAir;
	private AngarPanel angarpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAngar window = new FormAngar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormAngar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1050, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		angarpanel = new AngarPanel();
		angarpanel.setBounds(10, 11, 768, 432);
		frame.getContentPane().add(angarpanel);
		angar = angarpanel.getPort();
		JPanel pictureBoxHangar = new JPanel();
		pictureBoxHangar.setBounds(0, 0, 778, 466);
		frame.getContentPane().add(pictureBoxHangar);

		JButton buttonSetAir = new JButton("Airplane");
		buttonSetAir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color mainColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				Airplane air = new Airplane(100, 1000, mainColor);
				int place = angar.Plus(air);
				MyPanel.initialization = true;
				angarpanel.repaint();
			}
		});
		buttonSetAir.setBounds(788, 11, 110, 20);
		frame.getContentPane().add(buttonSetAir);

		JButton buttonSetAir2 = new JButton("Flybomber");
		buttonSetAir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color mainColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				Color dopColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				Flybomber air = new Flybomber(100, 1000, mainColor, dopColor);
				int place = angar.Plus(air);
				MyPanel.initialization = true;
				angarpanel.repaint();
			}
		});
		buttonSetAir2.setBounds(788, 42, 110, 20);
		frame.getContentPane().add(buttonSetAir2);

		JPanel panel = new JPanel();
		panel.setBounds(779, 226, 250, 230);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		pictureBoxTakeAir = new MyPanel();
		pictureBoxTakeAir.setBounds(12, 102, 250, 180);
		panel.add(pictureBoxTakeAir);

		JLabel label = new JLabel("Take Airplane");
		label.setBounds(12, 0, 110, 20);
		panel.add(label);

		maskedTextBox1 = new JTextField();
		maskedTextBox1.setBounds(68, 29, 70, 22);
		panel.add(maskedTextBox1);
		maskedTextBox1.setColumns(10);

		JLabel label_1 = new JLabel("Place:");
		label_1.setBounds(12, 32, 56, 16);
		panel.add(label_1);

		JButton buttonTakeAir = new JButton("Take");
		buttonTakeAir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!maskedTextBox1.getText().equals("")) {
					ITransport air = angar.Minus(Integer.parseInt(maskedTextBox1.getText()));
					if (air != null) {
						air.SetPosition(35, 30, pictureBoxTakeAir.getWidth(), pictureBoxTakeAir.getHeight());
						pictureBoxTakeAir.setAir(air);
						pictureBoxTakeAir.repaint();
						angarpanel.repaint();
					} else {
						pictureBoxTakeAir.setAir(null);
						pictureBoxTakeAir.repaint();
					}
				}
			}
		});
		buttonTakeAir.setBounds(22, 64, 110, 20);
		panel.add(buttonTakeAir);
	}
}