# Automation Framework (base)

Base framework for web and mobile (ios, android) automation testing using Selenium WebDriver and Appium.

## Setup

### MacOS

#### Prerequisites

- Install Java JDK
  - Ensure that the JAVA_HOME environment variable is also set to the JDK path
    ```
    export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home"
    ```
- Install Android SDK via Android Studio
  - Set ANDROID_HOME
    Example:
    ```
    /Users/<username>/Library/Android/sdk
    ```
- Install Homebrew
  ```
  /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
  ```
- Install Node.js and NPM
  ```
  brew install node
  ```
- Install Appium
  ```
  npm install -g appium
  ```
  or
  ```
  npm install -g appium@1.7.0
  ```

#### Android Driver Setup



