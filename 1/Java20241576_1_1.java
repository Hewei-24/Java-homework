public class Java20241576_1_1 {
    private static final double INCH_TO_CM = 2.54;
    private static final double ASPECT_RATIO_WIDTH = 16;
    private static final double ASPECT_RATIO_HEIGHT = 9;
    public static double[] calculateTVSize(double diagonalSize) {
        double widthInInches = ASPECT_RATIO_WIDTH / Math.sqrt(Math.pow(ASPECT_RATIO_WIDTH, 2) + Math.pow(ASPECT_RATIO_HEIGHT, 2)) * diagonalSize;
        double heightInInches = ASPECT_RATIO_HEIGHT / Math.sqrt(Math.pow(ASPECT_RATIO_WIDTH, 2) + Math.pow(ASPECT_RATIO_HEIGHT, 2)) * diagonalSize;

        double widthInCm = widthInInches * INCH_TO_CM;
        double heightInCm = heightInInches * INCH_TO_CM;

        return new double[]{widthInCm, heightInCm};
    }
    public static boolean canFitInLivingRoom(double tvWidth, double tvHeight, double roomWidth, double roomHeight) {
        return (tvWidth <= roomWidth && tvHeight <= roomHeight) || (tvWidth <= roomHeight && tvHeight <= roomWidth);
    }

    public static void main(String[] args) {
        double diagonalSize = 55; 
        double[] tvSize = calculateTVSize(diagonalSize);

        double roomWidth = 200; 
        double roomHeight = 150;

        boolean canFit = canFitInLivingRoom(tvSize[0], tvSize[1], roomWidth, roomHeight);

        System.out.println("电视机尺寸（厘米）：宽度 = " + tvSize[0] + ", 高度 = " + tvSize[1]);
        System.out.println("电视机能否放在客厅里：" + (canFit ? "能" : "不能"));
    }
}