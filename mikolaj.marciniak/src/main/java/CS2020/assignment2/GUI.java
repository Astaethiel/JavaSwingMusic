package CS2020.assignment2;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
   private JFrame frame;
   JMenuItem about;
   JMenuItem data;
   JMenuItem export;
   JButton buttonBottom1;
   JButton buttonBottom2;
   JButton buttonBottom3;
   JList jlst = new JList();
   JTextArea textArea;
   JScrollPane scroll;

   public GUI(){
      prepareGUI();
      showMenuBar();
      showAppContent();
      frame.setVisible(true);
   }

   private void prepareGUI(){
      frame = new JFrame("Mikolaj Marciniak: Assignment 2");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800,600); 
   }

   private void showMenuBar(){
    JMenuBar mb=new JMenuBar();  
    about=new JMenuItem("About");
    about.addActionListener((ActionListener) new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Assignment 2 App v0.1");
        }
    });
    data=new JMenuItem("Data");  
    export=new JMenuItem("Export to CSV");  
    mb.add(about);
    mb.add(data);
    mb.add(export);
    frame.setJMenuBar(mb);   
   }

   private void showAppContent(){
    JButton buttonBottom1=new JButton("Add data manually");  
    JButton buttonBottom2=new JButton("Add data from database");  
    JButton buttonBottom3=new JButton("Delete Selected");

    JPanel mainPanel = new JPanel(new BorderLayout());
    Container eastPanel = new JPanel(new BorderLayout());
    mainPanel.add(eastPanel, BorderLayout.CENTER);

    
    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    mainPanel.add(new JScrollPane(jlst), BorderLayout.CENTER);
    textArea = new JTextArea(5, 25); 
    scroll = new JScrollPane(textArea); 
    eastPanel.add(scroll, BorderLayout.CENTER);
    mainPanel.add(eastPanel, BorderLayout.EAST);
    
    JPanel labelPanel = new JPanel(new BorderLayout());
    labelPanel.setLayout(new GridLayout(3, 2));
    JLabel dobLabel = new JLabel("Date of Birth:");
    JTextField dobField = new JTextField("");
    JLabel placeLabel = new JLabel("Place of Birth:");
    JTextField placeField = new JTextField("");
    JLabel weekendLabel = new JLabel("Born on Weekend:");
    JTextField weekendField = new JTextField("");

    labelPanel.add(dobLabel, BorderLayout.WEST);
    labelPanel.add(dobField);
    labelPanel.add(placeLabel, BorderLayout.WEST);
    labelPanel.add(placeField);
    labelPanel.add(weekendLabel, BorderLayout.WEST);
    labelPanel.add(weekendField);
    eastPanel.add(labelPanel, BorderLayout.NORTH);


    JPanel buttonPane = new JPanel(new BorderLayout());
    buttonPane.setLayout(new GridLayout(1, 3));
    buttonPane.add(buttonBottom1, BorderLayout.SOUTH);
    buttonPane.add(buttonBottom2, BorderLayout.SOUTH);
    buttonPane.add(buttonBottom3, BorderLayout.SOUTH);
    mainPanel.add(buttonPane, BorderLayout.SOUTH);
    frame.add(mainPanel);
   }
}
