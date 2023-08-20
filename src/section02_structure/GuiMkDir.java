package section02_structure;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GuiMkDir extends JFrame {

    private GuiMkDir() {

        setTitle("mkdir");
        setLayout(new FlowLayout());
        setSize(400, 200);
        JTextField tfName = new JTextField();
        tfName.setPreferredSize(new Dimension(200, 30));
        add(tfName);
        JButton btMkDir = new JButton("Make directory");
        btMkDir.addActionListener(e -> new File(tfName.getText()).mkdir());
        add(btMkDir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> new GuiMkDir().setVisible(true));
        //create new directory ExampleGuiMkDirNew
    }
}