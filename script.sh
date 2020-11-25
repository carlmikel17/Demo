#!/bin/bash
for i in {1..30}; do echo $i; sleep 1; done

mkdir results
cd results/
touch carl.txt
echo "test2" > carl.txt

