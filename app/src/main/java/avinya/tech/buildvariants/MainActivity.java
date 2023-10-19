package avinya.tech.buildvariants;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import avinya.tech.buildvariants.buildutils.BuildType;
import avinya.tech.buildvariants.buildutils.BuildUtils;
import avinya.tech.buildvariants.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BuildType buildType = BuildUtils.getBuildType();

        String STAGE_MODE = "STAGING";
        String PRODUCTION_MODE = "PRODUCTION";
        String DEV_MODE = "DEVELOPMENT";

        switch (buildType) {
            case DEVELOPMENT:
                binding.textViewBuildType.setText(DEV_MODE);
                break;
            case STAGING:
                binding.textViewBuildType.setText(STAGE_MODE);
                break;
            case PRODUCTION:
                binding.textViewBuildType.setText(PRODUCTION_MODE);
                break;
        }
    }
}