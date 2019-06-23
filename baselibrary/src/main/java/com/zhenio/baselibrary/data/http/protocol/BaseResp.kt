package com.zhenio.baselibrary.data.http.protocol

class BaseResp<out T>(val status:Int,val message:String,val data:T)
