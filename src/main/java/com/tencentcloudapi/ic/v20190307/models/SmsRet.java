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

public class SmsRet extends AbstractModel{

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
    * 卡片ID
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 流水ID
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
     * Get 该iccid请求状态 
     * @return Code 该iccid请求状态
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 该iccid请求状态
     * @param Code 该iccid请求状态
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 短信发送返回信息 
     * @return Msg 短信发送返回信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 短信发送返回信息
     * @param Msg 短信发送返回信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 卡片ID 
     * @return Iccid 卡片ID
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 卡片ID
     * @param Iccid 卡片ID
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 流水ID 
     * @return Sid 流水ID
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 流水ID
     * @param Sid 流水ID
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Sid", this.Sid);

    }
}

