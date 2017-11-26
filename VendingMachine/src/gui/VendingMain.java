package gui;

public class VendingMain {
	
    private static void startGUI() {
		VendingGUI window = new VendingGUI();
		window.pack();
		window.setVisible(true);
   }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                startGUI();
            }
        });
    }
}
