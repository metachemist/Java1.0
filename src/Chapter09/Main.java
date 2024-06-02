package Chapter09;

public class Main {
    public static void main(String[] args){

        //Create a circle with radius of 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        //create a circle with radius of 25 
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        //create a circle with radius of 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        //modify the radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());


        Television tv1 = new Television();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(2);

        Television tv2 = new Television();
        tv2.turnOn();
        tv2.setChannel(40);
        tv2.setVolumeLevel(6);

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
