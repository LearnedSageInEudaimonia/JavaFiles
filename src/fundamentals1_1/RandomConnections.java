package com.fundamentals1_1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
import java.util.Scanner;

public class RandomConnections extends JPanel {

    private final int N;
    private final double p;
    private final Point2D[] points;

    public RandomConnections(int N, double p) {
        this.N = N;
        this.p = p;
        this.points = new Point2D[N];
        generatePoints();
    }

    private void generatePoints() {
        double angleStep = 2 * Math.PI / N;
        for (int i = 0; i < N; i++) {
            double angle = i * angleStep;
            double x = 0.5 + 0.45 * Math.cos(angle);
            double y = 0.5 + 0.45 * Math.sin(angle);
            points[i] = new Point2D.Double(x, y);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw points
        g2.setColor(Color.BLACK);
        for (Point2D point : points) {
            g2.fill(new Ellipse2D.Double(point.getX() * getWidth() - 2.5, point.getY() * getHeight() - 2.5, 5, 5));
        }

        // Draw lines
        Random random = new Random();
        g2.setColor(Color.GRAY);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (random.nextDouble() < p) {
                    g2.draw(new Line2D.Double(
                            points[i].getX() * getWidth(), points[i].getY() * getHeight(),
                            points[j].getX() * getWidth(), points[j].getY() * getHeight()));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int N = read.nextInt();
        double p = read.nextDouble();

        if (N <= 0 || p < 0 || p > 1) {
            System.out.println("Invalid arguments. Ensure that N > 0 and 0 <= p <= 1.");
            return;
        }

        JFrame frame = new JFrame("Random Connections");
        RandomConnections panel = new RandomConnections(N, p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
