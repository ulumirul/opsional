/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ulum
 */
public class ModelBiodata extends AbstractTableModel{

    public List<Biodata> listData = new ArrayList<>();
    public String[] colName = {"ID","Nama","Gender"};
    
    public void setListData(List<Biodata> listData){
        this.listData = listData;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return listData.size();
    }

    @Override
    public int getColumnCount() {
        return colName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> listData.get(rowIndex).getNomor();
            case 1 -> listData.get(rowIndex).getNama();
            case 2 -> listData.get(rowIndex).getGender();
            default -> null;
        };
    }
    
}
