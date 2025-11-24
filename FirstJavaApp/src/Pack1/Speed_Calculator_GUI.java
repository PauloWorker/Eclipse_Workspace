package Pack1;

import javax.swing.JOptionPane;

public class Speed_Calculator_GUI {
    public static void main(String[] args) {

        float speed = 0, time = 0, distance = 0;
        int choice = 0;

        do{
            // JOptionPane.showMessageDialog(null, "Which one do you want to find out?: \n Type 1 for Speed \n Type 2 for Time \n Type 3 for Distance \n Type 0 for Cancel");
            choice = Integer.parseInt(JOptionPane.showInputDialog("Which one do you want to find out?: \n Type 1 for Speed \n Type 2 for Time \n Type 3 for Distance \n Type 0 for Cancel \n\n Type here:"));

            switch (choice) {
                case 1: //Speed
                    distance = Float.parseFloat(JOptionPane.showInputDialog("Type here the distance: "));
                    time = Float.parseFloat(JOptionPane.showInputDialog("Type here the time: "));

                    speed = distance / time;
                    
                    JOptionPane.showMessageDialog(null, "The speed is " + speed);

                    break;

                case 2: //Time
                    distance = Float.parseFloat(JOptionPane.showInputDialog("Type here the distance: "));
                    speed = Float.parseFloat(JOptionPane.showInputDialog("Type here the speed: "));

                    time = distance / speed;

                    JOptionPane.showMessageDialog(null, "The time is " + time);

                    break;

                case 3: //Distance

                    speed = Float.parseFloat(JOptionPane.showInputDialog("Type here the speed: "));
                    time = Float.parseFloat(JOptionPane.showInputDialog("Type here the time: "));

                    distance = speed * time;

                    JOptionPane.showMessageDialog(null, "The distance is " + distance);

                    break;
            
            }

            System.out.println(); // Break a line

            speed = 0;
            time = 0;
            distance = 0;

        }while(choice >= 1 && choice <= 3);

        if(choice < 1 || choice > 3)
        {
            System.out.println("Operation Cancelled");
            JOptionPane.showMessageDialog(null, "Operation Cancelled");

        }
    }
}
