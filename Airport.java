class Airport {
    String airport_loc;
    long airport_capacity;
    int no_plane;
    Aeroplane A;

    Airport(String airport_loc,long airport_capacity,int no_flights,Aeroplane A)
    {
        this.airport_loc=airport_loc;
        this.airport_capacity=airport_capacity;
        this.no_plane=no_plane;
        this.A=A;
    }
    public static void main(String args[])
    {
        Airport AC=new Airport("manglore",5000,25,new Aeroplane("red","ETIHAD",300));
        System.out.println( "AIRPORT LOCATION :"+ AC.airport_loc +" AIRPORT CAPACITY IS " +AC.airport_capacity);
    }
}


