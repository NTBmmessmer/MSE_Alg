package gifts;

public class Gift {
    public final int id;
    public final Coordinate coordinate;
    public final double weight;
    public int tourId;

    public Gift(int id, Coordinate coordinate, double weight, int tourId) {
        this.id = id;
        this.coordinate = coordinate;
        this.weight = weight;
        this.tourId = tourId;
    }

    public int TourId(){
        return tourId;
    }

    public void setTourId(int tourId){
        this.tourId = tourId;
    }
    public int GiftId() { return id;}
}