# Android-SimpleStaticImagesSwitcher
This is a simple image switcher for practicing ImageView in Android studio.

### Features
* ImageView width and height is set to activity parent size.
* Six dog images used as default.
* Basic button used for switching.
* Images repeat after the last image is displayed

### Instructions to run the application
1. Clone or Download the project to your PC/Laptop.
1. Open Android Studio
1. Select the option "Open an existing Android Studio project"
1. Locate the project folder in your directory.
1. Select your target device.
1. Select menu ```Run -> Run 'app'```

#### Adding custom images to the app.
1. Copy the image files to _drawable_ folder in _res_ folder. _(Make sure that image filenames do not have characters like '-' or space)_
1. Open the file ```MainActivity.java``` file.
1. Add image refernence id inside the curly braces 
``` images = new int[] {R.drawable.dog1, ... R.drawable.dog6}; ```
1. __Thats it!__
