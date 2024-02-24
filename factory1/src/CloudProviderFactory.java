public class CloudProviderFactory {

    public static CloudProvider getCloudProvider(String cloudProvider) {
        switch (cloudProvider.toLowerCase()) {
            case "aws":
                return new AWSCloudProvider();
            case "gcp":
                return new GoogleCloudProvider();
            case "azure":
                return new MicrosoftCloudProvider();
            default:
                throw new RuntimeException("Invalid cloud provider name.");
        }

    }
}
