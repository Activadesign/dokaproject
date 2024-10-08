// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply true
    alias(libs.plugins.jetbrains.kotlin.android) apply true
    alias(libs.plugins.org.jetbrains.kotlin.kapt) apply true
    alias(libs.plugins.google.dagger.hilt.android) apply true }
