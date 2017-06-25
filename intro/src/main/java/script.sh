#!/bin/bash
echo "Solutions for intro module."
echo ""
echo "First task solution."
javac -d ../../../build/classes/main/ -cp . task1/*.java
java -cp ../../../build/classes/main/ task1/Main
echo ""