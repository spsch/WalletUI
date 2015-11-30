#!/usr/bin/env bash

SRCDIR=~/workspace/WalletUI/
BINDIR=~/workspace/WalletUI/bin/
DEVDIR=/data/local/tmp
PROJ=WalletUI
TEST=co.cashplay.walletui.LoginTest
TEST2=co.cashplay.walletui.DepositTest

function clean() {

    echo "cleaning workspace"
    ant clean
}

function build() {

    echo "building jar"
    cd $SRCDIR
    if [[ -e $SRCDIR/build.xml  ]]; then
        ant build
    else
        echo "build file is missing"
    fi
}

function deploy() {

DEV=$(adb get-state)

while [[ $DEV == "unknown" ]]; do
    echo "no device or more devices are connected"
    exit 11
done

adb push $BINDIR/*.jar $DEVDIR

RESULT=$(echo $?)

while [[ $RESULT = 1 ]]; do
    echo "can not deploy jar, please check directory or device (locked?)"
    exit 12
done
}

function runtest() {
    echo "running tests"
    adb shell uiautomator runtest $DEVDIR/$PROJ.jar -c $TEST
    adb shell uiautomator runtest $DEVDIR/$PROJ.jar -c $TEST2
}

clean
build
deploy
runtest