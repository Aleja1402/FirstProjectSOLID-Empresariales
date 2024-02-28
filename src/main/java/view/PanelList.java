package view;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelList extends JPanel {
    
    private JTable table;
    private DefaultTableModel tableModel;

    public PanelList() {
        TitledBorder border = BorderFactory.createTitledBorder("List");
        setBorder(border);
        border.setTitleColor(Color.BLACK);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        String[] columns = {"Name", "Surname", "Program"};
        tableModel = new DefaultTableModel(columns, 0);

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    public void addData(Object[] rowData) {
        tableModel.addRow(rowData);
    }

    public void clearData() {
        tableModel.setRowCount(0);
    }
    
    public void updateView() {
        revalidate();
        repaint();
    }
    
    public void addPersonToTable(String name, String surname, String program) {
        Object[] rowData = {name, surname, program };
        addData(rowData);
        updateView();
    }

    public void deleteSelectedRow() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        }
    }
    
}