package avinya.tech.buildvariants.buildutils;

import avinya.tech.buildvariants.BuildConfig;

public class BuildUtils {

    public static BuildType getBuildType() {
        return BuildType.fromString(BuildConfig.BUILD_TYPE);
    }

}
