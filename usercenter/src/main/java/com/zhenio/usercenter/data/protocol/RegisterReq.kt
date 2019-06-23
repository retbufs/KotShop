package com.zhenio.usercenter.data.protocol

data class RegisterReq(
    val mobile: String,
    val verifyCode: String,
    val password: String
)