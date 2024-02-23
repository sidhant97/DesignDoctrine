package prototypeWithRegistry;

public class AdvanceSearchAPI extends SearchAPI {

    private String query;

    public AdvanceSearchAPI() {


    }

    public AdvanceSearchAPI(AdvanceSearchAPI advanceSearchAPI) {
        super(advanceSearchAPI);
        this.query = advanceSearchAPI.query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public AdvanceSearchAPI copy() {
        return new AdvanceSearchAPI(this);
    }

    @Override
    public String toString() {
        return "prototypeWithRegistry.AdvanceSearchAPI{" +
                "query='" + query + '\'' +
                '}';
    }
}
