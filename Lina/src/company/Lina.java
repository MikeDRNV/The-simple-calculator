package company;


import javax.swing.*;



public class Lina {
    private JFrame window; // окно виндовс
    public Lina(){
        window = new JFrame("Calculator");
        window.setSize(265,345);
        window.add(new PanelOne());
        window.setLocationRelativeTo(null); // чтобы окно было в центе экрана
        window.setResizable(false); // чтобы нельзя было менять размер окна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Lina();
            }
        });
    }
}

