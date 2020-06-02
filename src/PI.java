public class PI {
    public static void main(String[] args) {

        int N=10000;
        float Rtg_x = 10, Rtg_y = 10;
        float r = Rtg_x/2;

        float Circle_c = 0;

        float RecordPI = 0;

        for (int i = 0; i < N; i++) {
            float dart_x = (float) (Math.random() * r);
            float dart_y = (float) (Math.random() * r);
            float d = (float) Math.sqrt(dart_x * dart_x + dart_y * dart_y);

            if (d < r)
                Circle_c++;

            float pi = 4 * Circle_c / (float) N;
            float RecordDiff = (float) Math.abs(Math.PI - RecordPI);
            float diff = (float) Math.abs(Math.PI - pi);
            if (diff < RecordDiff) {
                RecordPI = pi;
                System.out.println(pi);
            }
        }
    }
}