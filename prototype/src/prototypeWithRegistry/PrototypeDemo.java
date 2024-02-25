package prototypeWithRegistry;

public class PrototypeDemo {

    public static void fillRegistry(SearchRegistry searchRegistry) {
        AdvanceSearchAPI advanceSearchAPI = new AdvanceSearchAPI();
        advanceSearchAPI.setPath("/query?");
        advanceSearchAPI.setToken("123456977");
        advanceSearchAPI.setUrl("https://www.google.com");
        advanceSearchAPI.setQuery("eq:firstName");
        System.out.println(advanceSearchAPI);
        searchRegistry.setRegistry("searchByFirstName", advanceSearchAPI);

        AdvanceSearchAPI advanceSearchAPI1 = advanceSearchAPI.copy();
        advanceSearchAPI1.setQuery("eq:lastName");
        System.out.println(advanceSearchAPI1);
        searchRegistry.setRegistry("searchByLastName", advanceSearchAPI1);
    }

//    public static void main(String[] args) {
//        SearchRegistry searchRegistry = new SearchRegistry();
//        fillRegistry(searchRegistry);
//
//        SearchAPI searchByLastName = searchRegistry.getRegistry("searchByLastName").copy();
//        System.out.println(searchByLastName.toString());
//
//        SearchAPI searchByFirstName = searchRegistry.getRegistry("searchByFirstName").copy();
//        System.out.println(searchByFirstName.toString());
//
//
//    }

    public static void main(String[] args) {
        SearchAPI searchAPI = new SearchAPI();
        SearchAPI searchAPICopy = new SearchAPI();
        searchAPICopy.setPath(searchAPI.getUrl());
        searchAPICopy.setToken(searchAPI.getToken());
        searchAPICopy.setUrl(searchAPI.getUrl());
    }


}