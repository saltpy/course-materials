#!/usr/bin/env bash

sudo apt-get install python-pip -y
sudo apt-get install python-ipython -y

sudo pip install flake8
sudo pip install virtualenvwrapper
mkdir -p ~/PyEnvs
echo "export WORKON_HOME=~/PyEnvs" >> ~/.bashrc
echo ". /usr/local/bin/virtualenvwrapper.sh" >> ~/.bashrc
