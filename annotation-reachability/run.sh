#!/bin/sh

set -x

infer --annotation-reachability-only -- javac -classpath ../annotations.jar ExpensiveInheritance.java
