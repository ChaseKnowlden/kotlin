// EXPECTED_REACHABLE_NODES: 1284
package foo

// CHECK_FUNCTION_EXISTS: multiplyBy2$lambda
// CHECK_CALLED_IN_SCOPE: scope=multiplyBy2 function=multiplyBy2$lambda TARGET_BACKENDS=JS
// HAS_NO_CAPTURED_VARS: function=multiplyBy2 except=multiplyBy2$lambda
// CHECK_NOT_CALLED_IN_SCOPE: scope=multiplyBy2 function=run

internal inline fun <T> run(noinline func: (T) -> T, arg: T): T {
    return func(arg)
}

internal fun multiplyBy2(x: Int): Int {
    return run({ it * 2 }, x)
}

fun box(): String {
    assertEquals(0, multiplyBy2(0))
    assertEquals(4, multiplyBy2(2))
    assertEquals(8, multiplyBy2(4))

    return "OK"
}
