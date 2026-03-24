#!/usr/bin/env bash

set -e  # stop on error

echo "======================================"
echo "Running Java tests + coverage..."
echo "======================================"
cd java
mvn verify

cd ..

echo "======================================"
echo "Running Python tests + coverage..."
echo "======================================"
cd python
python -m pip install -r requirements.txt
python -m pytest --cov=problems --cov-report=term-missing --cov-report=html --cov-fail-under=80

cd ..

echo "======================================"
echo "✅ All checks passed!"
echo "======================================"