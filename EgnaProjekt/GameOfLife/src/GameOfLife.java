import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameOfLife extends JFrame implements ActionListener {

    private int size = 50;
    private CellPanel cellPanel;
    private Timer timer;

    public GameOfLife() {
        setTitle("Game of Life");
        setSize(size * 10, size * 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cellPanel = new CellPanel();
        add(cellPanel);

        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cellPanel.updateCells();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameOfLife game = new GameOfLife();
            game.setVisible(true);
        });
    }

    private class CellPanel extends JPanel {

        private Cell[][] cells;

        public CellPanel() {
            cells = new Cell[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    cells[i][j] = new Cell();
                }
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    cells[i][j].draw(g, i * 10, j * 10);
                }
            }
        }

        public void updateCells() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    cells[i][j].update();
                }
            }
            repaint();
        }
    }

    private class Cell {

        private boolean alive;

        public Cell() {
            alive = false;
        }

        public void draw(Graphics g, int x, int y) {
            if (alive) {
                g.setColor(Color.black);
                g.fillRect(x, y, 10, 10);
            }
        }

        public void update() {
            // Implement logic to update cell status (alive or dead) based on rules
            // For example: count neighbors and update based on Game of Life rules
        }
    }
}
