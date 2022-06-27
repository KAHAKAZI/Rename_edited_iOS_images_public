#!/bin/bash

echo -e "Rename IMG's files - remove 'E' character from name\n"

echo "Files to rename: " $(ls -l | grep IMG_E | wc -l)

counter=0;

for file in *.* ;
do
	containsE=$(echo "$file" | grep E);
	isImg=$(echo "$file" | grep IMG_);

	if [ $containsE ] && [ $isImg ];
	then
		echo "Before: " $file;

		mv "${file}" "${file/E/}";
		((counter++))

		echo "After: " ${file/E/};
	fi;

done

echo "Files renamed: " $counter;
