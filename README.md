# Rename edited iOS images and remove AAE files

## About

---
Renaming files:

iOS saves edited images on the device with the additional letter 'E'. The below tools rename all edited images in such a way that the letter 'E' is removed form the filename so all the pictures names are consistent.

Removing .AAE files:

Editing pictures in iOS produces additional .AAE files with edition metadata. These files can be removed.

Exemplary use case:

```aidl
Example:
Input name: IMG_E456.JPG
Output name: IMG_456.JPG
```

## Bash version:

---

Run the bash script inside the directory where the files are located:

```aidl
./rename_edited_iOS_images.sh
```

Run the bash script inside the directory where .AAE files are located:

```aidl
./remove_aae.sh.sh
```

## Java version to rename files:

--- 

### Build requirements:
* JDK 1.8 or higher
* Maven

### Build:
```aidl
mvn clean package
```

### Execution:
Run the build jar file inside the folder where images are located:
```aidl
java -jar rename_edited_iOS_images-2.0.jar.jar
```
or

Run the jar file with specified pictures path as a parameter:
```aidl
On linux:

java -jar rename_edited_iOS_images-2.0.jar.jar ~/Pictures/Mypictures
```