package ru.mirea.pr4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResultsTable extends JFrame
{
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");
    JLabel result = new JLabel("Result 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JPanel panel_1 = new JPanel();
    JPanel panel_2 = new JPanel();
    JPanel panel_3 = new JPanel();

    int milanPoints = 0, madridPoints = 0;

    public ResultsTable()
    {
        super("Result Table");

        setSize(500, 300);
        setLayout(new BorderLayout());

        panel_1.setLayout(new GridBagLayout());
        panel_2.setLayout(new GridBagLayout());
        panel_3.setLayout(new GridBagLayout());

        add(milanButton, BorderLayout.WEST);
        add(madridButton, BorderLayout.EAST);

        add(panel_1, BorderLayout.NORTH);
        panel_1.add(result);

        add(panel_2, BorderLayout.CENTER);
        panel_2.add(lastScorer);

        add(panel_3, BorderLayout.SOUTH);
        panel_3.add(winner);
        setVisible(true);

        milanButton.addActionListener(ae -> {
            ++milanPoints;
            result.setText("Result " + milanPoints + " X " + madridPoints);
            lastScorer.setText("Last Scorer: AC Milan");
            if (milanPoints > madridPoints)
                winner.setText("Winner: AC Milan");
            else if (milanPoints == madridPoints)
                winner.setText("Winner: DRAW");
        });

        madridButton.addActionListener(ae -> {
            ++madridPoints;
            result.setText("Result " + milanPoints + " X " + madridPoints);
            lastScorer.setText("Last Scorer: Real Madrid");
            if (madridPoints > milanPoints)
                winner.setText("Winner: Real Madrid");
            else if (milanPoints == madridPoints)
                winner.setText("Winner: DRAW");
        });
    }


    public static void main(String[] args)
    {
        ResultsTable resultTable = new ResultsTable();
    }
}
