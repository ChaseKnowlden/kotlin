/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

fun id(a: Any?): Any? {
    return a
}

fun main() {
    // CHECK: [[OBJ:%.*]] = invoke %struct.ObjHeader* @"kfun:#id(kotlin.Any?){}kotlin.Any?"
    val x = id("Hello")
    // CHECK: invoke void @"kfun:kotlin.io#println(kotlin.Any?){}"(%struct.ObjHeader* [[OBJ]])
    println(x)
}