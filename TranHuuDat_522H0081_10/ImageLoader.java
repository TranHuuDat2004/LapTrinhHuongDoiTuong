public class ImageLoader {
    private static ImageLoader instance = null;

    private ImageLoader() {
        // private constructor to prevent instantiation from outside
    }

    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }

    public String loadImage() {
        return "Loaded successfully.";
    }

    public static void main(String[] args) {
        ImageLoader loader1 = ImageLoader.getInstance();
        ImageLoader loader2 = ImageLoader.getInstance();

        System.out.println(loader1.loadImage());
        System.out.println(loader2.loadImage());

        // Check if both instances are the same
        System.out.println(loader1 == loader2); // output: true
    }
}

