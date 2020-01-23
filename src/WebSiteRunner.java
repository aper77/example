public class WebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ViziteCardWebSiteBuilder());
        WebSite webSite = director.buildWebSide();

        System.out.println(webSite);
    }
}
