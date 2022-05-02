package com.mg.dicepractice

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class LoginUtilsTest {
    private lateinit var LoginUtils: LoginUtils
    @Before
    fun SetUp(){
        LoginUtils = LoginUtils()
    }

    @Test
    fun validateEmailPasses(){
        assertTrue(LoginUtils.ValidateEmail("mohamedGomaa@gmail.com"))
    }

    @Test
    fun anInvalidateEmailFaild(){
        assertFalse(LoginUtils.ValidateEmail("mohamedGomaa"))
    }

    @Test
    fun anValidateLocalEmaillength(){
        assertSame(10,LoginUtils.getLocalPartLength("mohamedGom@gmail.com"))
    }
}