public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
    webSite.getName("Enterprise web site");
    }

    @Override
    void buildCms() {
    webSite.getCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
    webSite.getSize(10000);
    }
}
