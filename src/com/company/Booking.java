package com.company;

import java.util.Scanner;

class Reservation{
    private final int noPerson, type;
    private float KM, fare;
    String Source, Destination, dateOfJourney;

    Reservation(int _noPerson, int _type, float _KM, String _Source, String _Destination, String _dateOfJourney){
        noPerson = _noPerson;
        type = _type;
        KM = _KM;
        Source = _Source;
        Destination = _Destination;
        dateOfJourney = _dateOfJourney;
    }

    public float fare(){
        if (type == 1){
            fare = (KM*2)*noPerson;
        } else {
            fare = (float) (KM*1.5)*noPerson;
        }
        return fare;
    }

}

public class Booking {
    public static void main(String[] arg){
        Scanner newi = new Scanner(System.in);
        Scanner newf = new Scanner(System.in);
        Scanner news = new Scanner(System.in);
        int _noPerson,  _type;
        float _KM, _fare;
        String _Source, _Destination, _dateOfJourney;

        System.out.println("Enter number of person:");
        _noPerson = newi.nextInt();
        System.out.println("Enter Source:");
        _Source = news.nextLine();
        System.out.println("Enter Destination:");
        _Destination = news.nextLine();
        System.out.println("Enter distance:");
        _KM = newf.nextFloat();
        System.out.println("Enter date of Jpurney:");
        _dateOfJourney = news.nextLine();

        System.out.println("\n\n1. Press 1 for Bus\n2. Press 2 for Train");
        _type = newi.nextInt();

        Reservation newObj = new Reservation(_noPerson, _type, _KM, _Source, _Destination, _dateOfJourney);
        _fare = newObj.fare();

        System.out.println("Fare from "+newObj.Source+" to "+newObj.Destination+" is = " + _fare);

    }
}
