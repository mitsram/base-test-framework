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

Desired Capabilities
```
DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"<Package Name>");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "<Activity Name>");
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
```

#### iOS Setup

WebDriverAgent
- Go to: node_modules/appium-xcuitest-driver/WebDriverAgent
- mkdir -p Resources/WebDriverAgent.bundle
- sh ./Scripts/bootstrap.sh -d
- Open WebDriverAgent.xcodeproj
- Build WebDriverAgent with signed
- chmod -R 777 . appium-xcuitest-driver/*

