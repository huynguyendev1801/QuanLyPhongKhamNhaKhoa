package GUI;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

 public class CustomTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Get the value from the "Trạng thái điều trị" column
        String trangThai = table.getModel().getValueAt(row, 6).toString();

        // Set the background color based on the "Trạng thái điều trị" value
        if ("Kế hoạch".equals(trangThai)) {
            cell.setBackground(Color.BLUE); // Set blue color for "kế hoạch"
        } else if ("Đã hoàn thành".equals(trangThai)) {
            cell.setBackground(Color.GREEN); // Set green color for "đã hoàn thành"
        } else if ("Đã hủy".equals(trangThai)) {
            cell.setBackground(Color.YELLOW); // Set yellow color for "đã hủy"
        } else {
            cell.setBackground(table.getBackground()); // Set default background color
        }

        return cell;
    }
}