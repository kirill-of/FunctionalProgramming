package pro.ofitserov.stepik.functionalprogramming.practicallessons.t14;

public class Step1 {
    /**
     * 2.14 The chain of responsibility pattern in the functional style
     *Overview. The chain of responsibility pattern is a object-oriented design pattern that processes a request through a series of handlers (a chain). The request (or something else) is sent from one handler to another and processed by one or all of these handlers in the chain.
     *
     * In more detail: https://en.wikipedia.org/wiki/Chain-of-responsibility_pattern
     *
     * Usually, to implement this design pattern follow classes and method are created:
     *
     * a general handler is an abstract class or interface with a met﻿hod handle/process/etc and a method to set a ﻿next handler
     * one or more concrete handlers that implement the general handler
     * Using functional style we can implement it more simple. ﻿Instead of ﻿writing all ﻿concrete handlers we can write lambda expressions (or method references). For setting next handler it's possible to use function composition ﻿in similar to functions way.
     */
}
