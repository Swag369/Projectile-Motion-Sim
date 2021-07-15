//import java.awt.*;
//import java.util.Scanner;
////literally didnt use methods and stuff because the rubric is scuffed and idc that much about a class im not taking
//public class doodle {
//    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Angle:");
//        double angle = sc.nextInt();
//        System.out.println("Enter Velocity:");
//        double velocity = sc.nextInt();
//
//        double vx = velocity*Math.cos(angle*Math.PI/180);
//        double vy = velocity*Math.sin(angle*Math.PI/180);
//        double dt= 2* vy/9.8/30;
//
//        DrawingPanel panel = new DrawingPanel(1800, 800);
//        Graphics g = panel.getGraphics();
//
//        for(int i = 0; i<=30; i++){
//            double horizdist = vx * i * dt;
//            double vertdist = 500 + (-1 * vy * i * dt) + (9.8 * i * dt * i * dt) / 2;
//            g.setColor(Color.BLACK);
//            g.fillOval((int)Math.round(horizdist), (int)Math.round(vertdist), 100, 100);
//            Thread.sleep(100);
//            g.setColor(Color.WHITE);
//            g.fillOval((int)Math.round(horizdist), (int)Math.round(vertdist), 100, 100);//this leaves the trail which looks better
//            //g.fillOval((int)Math.round(horizdist)-1, (int)Math.round(vertdist)-1, 102, 102); this acctually "clears" the board
//            Thread.sleep(100);
//        }
//    }
//}