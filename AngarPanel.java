package labs;

import java.awt.Graphics;
import javax.swing.JPanel;

public class AngarPanel extends JPanel{
	public Angar<ITransport> angar;

    public Angar <ITransport> getPort() {
        return angar;
    }

    public AngarPanel() {
    	angar = new Angar<>(20, 615, 603);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(angar != null) {
        	angar.Draw(g);
        }
    }
}

