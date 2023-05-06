#!/bin/sh

set -x

infer --bufferoverrun-only -- cc overwrite.c

{ set +x; } 2>/dev/null

echo ""
echo "=============================================================================="
echo "=============================================================================="
echo "=============================================================================="
echo ""

set -x

infer --bufferoverrun-only -- javac Overwrite.java
