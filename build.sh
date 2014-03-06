#!/usr/bin/env bash

ROOT="PythonCourse"

lint() {
    flake8 $ROOT || exit $?
    echo "Lint passed!"
}

dev_install() {
    #pip install -r dev-requirements.pip || exit $?
    python setup.py develop || exit $?
    echo "Development install passed!"
}

unittest() {
    python -m unittest discover -s "$ROOT" -p '_*_test.py' || exit $?
    echo "Unittests passed!"
}

venv() {
    virtualenv "$ROOT"Env
    . ./"$ROOT"Env/bin/activate
    echo "Virtualenv resolved!"
}

#venv
dev_install
#lint
unittest
echo "Build passed!"
