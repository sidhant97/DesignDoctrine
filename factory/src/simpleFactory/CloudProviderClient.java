package simpleFactory;

public class CloudProviderClient {
    public static void main(String[] args) {

        CloudProvider awsCloudProvider = CloudProviderFactory.getCloudProvider("aws");

        awsCloudProvider.displayCloudProvider();

        System.out.println();

        CloudProvider azureCloudProvider = CloudProviderFactory.getCloudProvider("azure");

        azureCloudProvider.displayCloudProvider();
    }
}