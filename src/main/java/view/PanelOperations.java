package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperations extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JButton btnCreate;
    private JButton btnRead;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnClean;
    private GUIPrincipal parent;

    public PanelOperations(GUIPrincipal parent) {
        this.parent = parent;

        TitledBorder border = BorderFactory.createTitledBorder("Operations");
        setBorder(border);
        border.setTitleColor(Color.BLACK);
        setLayout(new GridLayout(1, 5));

        btnCreate = new JButton("Create");
        btnRead = new JButton("Read");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClean = new JButton("Clean");

        add(btnCreate);
        add(btnRead);
        add(btnUpdate);
        add(btnDelete);
        add(btnClean);

        btnCreate.addActionListener(this);
        btnRead.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClean.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCreate) {
            parent.create();
        } else if (e.getSource() == btnRead) {
            parent.read();
        } else if (e.getSource() == btnUpdate) {
            parent.update();
        } else if (e.getSource() == btnDelete) {
            parent.delete();
        } else if (e.getSource() == btnClean) {
            parent.clean();
        }
    }
}