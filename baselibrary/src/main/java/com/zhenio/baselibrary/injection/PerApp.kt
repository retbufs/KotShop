package com.zhenio.baselibrary.injection

import javax.inject.Scope
import java.lang.annotation.Documented
import java.lang.annotation.Retention

import java.lang.annotation.RetentionPolicy.RUNTIME

@Scope
@Documented
@Retention(RUNTIME)
internal annotation class PerApp
