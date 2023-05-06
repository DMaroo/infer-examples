#!/bin/sh

set -x

infer --pulse-only -- cc leaky.c
