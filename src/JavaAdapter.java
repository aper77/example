public class JavaAdapter {
    public static void main(String[] args) {
VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
g1.drawLine();
g1.drawSquare();
    }
}

interface VectorGraphicsInterface{

    void drawLine();
    void drawSquare();
}

class RasterGraphics{
    void drawRasterLine(){
        System.out.println("Paint Line");
    }
    void drawRasterSquare(){
        System.out.println("Paint Square");
    }
}

class VectorAdapterFromRaster extends  RasterGraphics implements VectorGraphicsInterface{
    public void drawLine(){
        drawRasterLine();
    }
    public void drawSquare(){
        drawRasterSquare();
    }
}