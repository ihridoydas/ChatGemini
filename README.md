# ChatGemini Android App
Project demonstration (AI Chat bot with Gemini) Using Android App Architecture (MVVM).

🧬 Samples
------------

|                              |
|------------------------------|
| ![app-settings](gemini2.gif) |

## Build Error
Add your API_KEY from
https://aistudio.google.com/app/prompts/new_chat

In order to build the project, you need to add the following line to your `local.properties` file:
```kotlin
API_KEY=YOUR_API_KEY
```

## What's Included

Explore third-party dependencies and documentation in [/documentation](/documentation). Notable inclusions:

- [Ktlint](/documentation/StaticAnalysis.md) for code formatting.
- [Detekt](/documentation/StaticAnalysis.md) for code smells.
- [Git Hooks](/documentation/GitHooks.md) for static analysis checks.
- [GitHub Actions](/documentation/GitHubActions.md) for continuous integration.
- [LeakCanary](https://square.github.io/leakcanary/) for detecting memory leaks.
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) and [Room](https://developer.android.com/training/data-storage/room) dependencies (removable via setup.gradle).
- [Paparazzi](https://github.com/cashapp/paparazzi) dependency (removable via setup.gradle).
- [Dokka](https://github.com/Kotlin/dokka) dependency, which document all project and module.
- [Spotless](https://github.com/diffplug/spotless) dependency, which is Keep your code spotless.
- [sortDependencies](https://github.com/square/gradle-dependencies-sorter) dependency, which is Sorts dependencies in build.gradle files.

## Dependency Setup

Dependencies are structured in [/buildscripts](/buildscripts). App module dependencies defined using a Gradle version catalog in [libs.versions.toml](gradle/libs.versions.toml).

## Danger Checks

Uses [Danger](https://danger.systems) for PR checks. See [Dangerfile](Dangerfile). Set up a Danger API key in GitHub secrets for GitHub Actions.

## Templates

Includes [Pull Request Template](/.github/pull_request_template.md) for organized PR descriptions.
