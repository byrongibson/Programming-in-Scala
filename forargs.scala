#!/bin/sh
exec scala "$0" "$@"
!#
//var arglist:String = ""
for (arg <- args)
    println(arg)
