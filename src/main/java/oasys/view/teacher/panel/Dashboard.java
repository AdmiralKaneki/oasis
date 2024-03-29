package oasys.view.teacher.panel;

import oasys.view.Constant;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Dashboard extends JPanel {
    private final JPanel announcementPanel = new JPanel();
    private final JPanel commandPanel = new JPanel();
    private final DefaultTableModel model = new DefaultTableModel(0,1);
    private final JTable table = new JTable(model);
    private final JButton post = new JButton("Post");
    private final JButton delete = new JButton("Delete");


    public Dashboard() {
        setLayout(new GridLayout(1,1));
        setAnnouncementPanel();
        add(announcementPanel);
    }

    private void setAnnouncementPanel() {
        announcementPanel.setBackground(Constant.COLOR_BLUE);
        announcementPanel.setLayout(new BorderLayout());

        model.addRow(new String[]{"Announcement/s:"});
        model.addRow(new String[]{"No Announcements."});

        table.setBackground(Constant.COLOR_WHITE);

        table.setShowVerticalLines(false);
        table.setShowHorizontalLines(false);

        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(true);
        table.setDefaultEditor(Object.class,null); // DISABLE EDIT setEditable(false)

        commandPanel.setLayout(new BorderLayout());
        commandPanel.setBackground(Constant.COLOR_BLUE);
        commandPanel.add(post,BorderLayout.WEST);
        commandPanel.add(delete,BorderLayout.EAST);


        announcementPanel.add(table,BorderLayout.CENTER);
        announcementPanel.add(commandPanel,BorderLayout.SOUTH);

    }

}
