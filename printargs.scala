#!/bin/sh
exec scala "$0" "$@"
!#

var i = 0
while (i < args.length) {
    println(args(i))
    i += 1
}
