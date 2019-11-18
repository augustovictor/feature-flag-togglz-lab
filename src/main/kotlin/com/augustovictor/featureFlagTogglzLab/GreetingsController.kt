package com.augustovictor.featureFlagTogglzLab

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.togglz.core.manager.FeatureManager

@RestController
@RequestMapping("/")
class GreetingsController(
        private val featureManager: FeatureManager
) {
    @GetMapping
    fun sayHello(): String {
        return if (featureManager.isActive(GreetingFeatures.SAY_HELLO)) "Hello world. | FEATURE ON! |"
        else "Hello world. Feature OFF"
    }
}