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
    or
    ```
    export JAVA_HOME=$(/usr/libexec/java_home)
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

Get the current package and activity name opened in the device
```
adb shell dumpsys window windows | grep -E ‘mCurrentFocus’
```


#### iOS Setup
```
- brew install ideviceinstaller
- brew install carthage
- npm install -g ios-deploy
- npm install -g deviceconsole
- gem install xcpretty
- brew install libimobiledevice
- *brew install libimobiledevice --HEAD - iOS 10
- *brew install libimobiledevice - iOS 9

```
WebDriverAgent Configuration
1. Go to: /usr/local/lib/node_modules/appium-xcuitest-driver/WebDriverAgent
2. mkdir -p Resources/WebDriverAgent.bundle
3. sh ./Scripts/bootstrap.sh -d
4. Open WebDriverAgent.xcodeproj
5. Build WebDriverAgent with signed
6. chmod -R 777 . appium-xcuitest-driver/*

