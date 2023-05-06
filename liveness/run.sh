#!/bin/sh

set -x

infer --liveness-only -- cc dead.cpp
