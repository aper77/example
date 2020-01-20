public class ViziteCardWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("visite card")
    }

    @Override
    void buildCms() {
    webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
    webSite.setPrice(1200);
    }
}
