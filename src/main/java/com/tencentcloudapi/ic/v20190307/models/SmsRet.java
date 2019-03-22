/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsRet  extends AbstractModel{

    /**
    * 该iccid请求状态
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 短信发送返回信息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 卡片id
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 流水id
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
     * 获取该iccid请求状态
     * @return Code 该iccid请求状态
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * 设置该iccid请求状态
     * @param Code 该iccid请求状态
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * 获取短信发送返回信息
     * @return Msg 短信发送返回信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * 设置短信发送返回信息
     * @param Msg 短信发送返回信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * 获取卡片id
     * @return Iccid 卡片id
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * 设置卡片id
     * @param Iccid 卡片id
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * 获取流水id
     * @return Sid 流水id
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * 设置流水id
     * @param Sid 流水id
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Sid", this.Sid);

    }
}

