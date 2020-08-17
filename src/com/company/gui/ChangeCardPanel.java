// This file is part of the 'texasholdem' project, an open source
// Texas Hold'em poker application written in Java.
//
// Copyright 2009 Oscar Stigter
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.company.gui;



import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Panel for selecting the amount to bet or raise.
 *
 * @author Oscar Stigter
 */
public class ChangeCardPanel extends JFrame implements  ActionListener {


    JRadioButton r1,r2;
    JButton b;
    /** Monitor while waiting for user input. */
    private final Object monitor = new Object();

    private Action defaultAction;

    /** The selected action. */
    private Action selectedAction;

    /**
     * Constructor.
     */
    public ChangeCardPanel() {



        JFrame f=new JFrame();
        JRadioButton r1=new JRadioButton("Card 1");
        JRadioButton r2=new JRadioButton("Card 2");
        JRadioButton r3=new JRadioButton("Card 3");
        JRadioButton r4=new JRadioButton("Card 4");
        JRadioButton r5=new JRadioButton("Card 5");


        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        r3.setBounds(75,150,100,30);
        r4.setBounds(75,200,100,30);
        r5.setBounds(75,250,100,30);

        b=new JButton("click");

        b.setBounds(100,300,80,30);




        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.add(r5);


        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    /**
     * Resets and shows the panel.
     *
     * @param defaultAction
     *            The default action.
     * @param minBet
     *            The minimum bet.
     * @param maxBet
     *            The maximum bet.
     *
     * @return The selected action.
     */

    /**
     * Returns the selected amount.
     *
     * @return The selected amount.
     */


    /** {@inheritDoc} */
    @Override
    public void actionPerformed(ActionEvent e){
        if(r1.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Male.");
        }
        if(r2.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Female.");
        }
    }

}
