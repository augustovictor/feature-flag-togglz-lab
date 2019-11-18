package com.augustovictor.featureFlagTogglzLab;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum GreetingFeatures implements Feature {
    @EnabledByDefault
    @Label("Provides and endpoint for hello world")
    SAY_HELLO
}
