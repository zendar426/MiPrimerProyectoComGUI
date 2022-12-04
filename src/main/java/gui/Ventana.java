package gui;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Ventana extends JFrame implements ActionListener {
    JButton boton1 = new JButton();
    public Ventana() throws HeadlessException, UnsupportedAudioFileException, LineUnavailableException, IOException {

        initScreen();
        Audio audio = new Audio();
        initButtons();

    }

    public void initButtons() {

        boton1.setText("enfrentar");
        boton1.setBounds(100,50,50,30);
        boton1.setHorizontalTextPosition(JButton.CENTER);
        boton1.setVerticalTextPosition(JButton.BOTTOM);
        add(boton1);
        boton1.setVisible(true);
        boton1.addActionListener(this);
    }



    private void initScreen() {
        JLabel label = new JLabel();
        //Boton boton = new Boton(1);

        ImageIcon image = new ImageIcon("src/main/resources/079 gif.gif");
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setSize(screenSize.width/2, screenSize.height/2);
        label.setText("SCP-079 WANTS TO MEET YOU");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("Feast of Flesh BB",Font.PLAIN,30));
        label.setForeground(Color.red);
        label.setIconTextGap(-25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setVisible(true);
        this.setBackground(Color.black);
        this.setTitle("game.exe");
        this.setLayout(new GridBagLayout());
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(800,800);
        ImageIcon picture = new ImageIcon("src/main/resources/106.png");
        this.setIconImage(picture.getImage());
        //this.getContentPane().setBackground(Color.GRAY);
        this.add(label);
        this.add(boton1);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){

            dispose();
            JFrame frame1 = new JFrame();
            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            frame1.getContentPane().setBackground(Color.black);
            frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame1.setUndecorated(true);
            panel.add(label);
            label.setText("Your computer is mine");
            label.setFont(new Font("Feast of Flesh BB",Font.PLAIN,30));

            label.setVerticalTextPosition(JLabel.CENTER);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setForeground(Color.white);
            label.setIconTextGap(-25);
            panel.setBackground(Color.black);

            frame1.add(panel);
            frame1.setVisible(true);

        }
    }
}
