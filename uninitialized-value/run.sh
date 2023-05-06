#!/bin/sh

set -x

infer --uninit-only -- cc uninit.c
