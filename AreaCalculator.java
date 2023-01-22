public class AreaCalculator {

    private final HouseModel houseModel;

    public AreaCalculator(HouseModel houseModel){
        this.houseModel = houseModel;
    }
    public double getFloorArea(){
        return houseModel.getCurrentWidth() * houseModel.getCurrentLength();
    }

    public double getWallArea(){
        var width = houseModel.getCurrentWidth();
        var length = houseModel.getCurrentLength();
        var height = houseModel.getCurrentHeight();

        var northSouthWallArea = width * height * 2; // x2 since we have 2 walls
        var eastWestWallArea = length * height * 2; // x2 since we have 2 walls
        return northSouthWallArea + eastWestWallArea;
    }

    public double getCarportArea(){
        return houseModel.getCurrentCarportLength() * houseModel.getCurrentCarportWidth();
    }
    public double getTotalArea(){
        return getFloorArea() + getCarportArea();
    }
}
