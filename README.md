# Poket Demo

## Overview
This is my demo project for the [Poket take-home assignment](https://github.com/poketapp/2024-summer-android).

It was created in Android Studio using Kotlin.

This app consists of a main landing page with a simple title and a single button labeled `Open Fruit Drawer`.

If the user pressed the button, then a bottom-sheet-dialog will open containing a scrollable list of 100 fruits that are imported from a standard CSV file, along with two buttons labeled `Select Fruit` and `Close`.

The `Close` button simply closes the dialog, while the `Select Fruit` button will print "Not Implemented" to an alert at the bottom of the screen.

## Setup Instructions
You can either run this project through Android Studio or directly install the app to your phone using the [APK file from the releases tab](https://github.com/reumarks/PoketDemo/releases/tag/Main).

### Running using Android Studio
- Make sure that you have the latest version of Android Studio installed, this project was created using Android Studio Jellyfish [2023.3.1]. 
- Open Android Studio and select `Get From VCS`
- Set the URL to `https://github.com/reumarks/PoketDemo.git` and the Directory to whereever you would like to open the project.
- If you get a notification asking about changing the Microsoft Defender Configuration, click "Automatically" and allow access when prompted by Windows.
- Once the project has finished loading, you should be able to run it on whatever Virtual or Physical devices you have connected to Android Studio by clicking the Green Arrow at the top of the screen.

### Installing using APK
- Go to the releases tab of this project and download the [PoketDemo.apk file](https://github.com/reumarks/PoketDemo/releases/tag/Main).
- Connect your phone to your Computer via USB and enable file transfers between the devices.
- Copy the .apk file into your phone's download folder (For me, that is `This PC\Pixel 4a\Internal shared storage\Download`).
- On your phone open the "files" app, go to your downloads folder, and tap on the .apk file you just downloaded.
- If your phone tells you that files the app does not have permission to run .apk files, then follow the instructions given and allow it.
- Click install.
- Once the apk is installed you should be able to find it in your App Drawer and run it like any other application.

## Additional notes and considerations
- Due to an incredibly full schedule and unexpected personal circumstances this app was developed in a single evening, so some aspects were not polished to the full degree that I would have preferred.
- The design document given did not specify what tools or languages we were expected to use, beyond recommending Android Studio. As this is a decently simple project and I have a working familiarity with Kotlin then I decided to implement it using that. If the intention was for the project to be created using a specific framework such as React or Angular, then I apologize for not reaching out and clarifying that, and I am happy to meet and talk through how I would implement this project using one of these libraries instead.
- My aplogoies again for how long this took, and I look forward to chatting with you.
