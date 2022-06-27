#!/bin/bash

echo "Remove all .AAE files from current directory"

for f in *.AAE
do
  echo "Working on file $f"
  rm $f
done
