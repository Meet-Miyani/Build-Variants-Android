package avinya.tech.buildvariants.buildutils;

public enum BuildType {

    DEVELOPMENT("developmentBuild"), STAGING("stagingBuild"), PRODUCTION("productionBuild");

    public String getType() {
        return type;
    }

    private final String type;

    BuildType(String type) {
        this.type = type;
    }

    public static BuildType fromString(String type) {
        for (BuildType buildType : BuildType.values()) {
            if (buildType.getType().equals(type)) {
                return buildType;
            }
        }
        throw new IllegalArgumentException("No enum constant found");
    }
}
