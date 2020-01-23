public class BuilderJava {
    public static void main(String[] args) {
        WebSite webSite = new WebSite();

        webSite.getName("vizit Card");
        webSite.getCms("Wordpress");
        webSite.getPrice(1200);

        System.out.println(webSite);

    }
}
