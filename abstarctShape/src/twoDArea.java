public class twoDArea extends twoD{
    private Double AreaSquare;
    private Double AreaRectangle;

    public twoDArea(String type, Double areaCircle, Double areaSquare, Double areaRectangle) {
        super(type);
        AreaCircle = areaCircle;
        AreaSquare = areaSquare;
        AreaRectangle = areaRectangle;
    }

    private static double pi =3.14;

    private Double AreaCircle;

    public Double getAreaCircle() {
        return AreaCircle;
    }

    public Double getAreaSquare() {
        return AreaSquare;
    }

    public Double getAreaRectangle() {
        return AreaRectangle;
    }
}
