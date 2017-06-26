#!/bin/bash
mkdir bin
echo "Solutions for intro module."
echo ""
echo "First task solution."
javac -d bin task1/*.java
java -cp ./bin task1/Main
echo ""