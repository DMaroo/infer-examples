#!/bin/sh

set -x

infer --eradicate-only -- javac -classpath ../annotations.jar:. FieldAccess.java
