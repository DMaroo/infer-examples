#!/bin/sh

infer --cost-only -- cc sort.c
cat infer-out/costs-report.json | jq 
