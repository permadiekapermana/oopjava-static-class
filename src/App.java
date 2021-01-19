public class App {
    private static String intro = "Pada tahun ini, saya ingin menguasai bahasa pemrograman JavaScript.";
    private static String frameWork = "MERN Stack (Mongo, ExpressJS, ReactJS, NodeJS";

    static class NestedClass{
        public void showIntro(){
            System.out.println(intro);
        }
        public void showFramework(){
            System.out.println(frameWork);
        }
    }
    public static void main(String[] args) throws Exception {
        App.NestedClass intro = new App.NestedClass();
        intro.showIntro();
        System.out.println("Tech Stack yang ingin saya kuasai yaitu :");
        intro.showFramework();
    }
}
