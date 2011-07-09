#!/bin/sh
exec scala "$0" "$@"
!#

args.foreach((arg:String) => println(arg))
