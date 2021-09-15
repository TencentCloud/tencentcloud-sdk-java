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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckVerifyCodeMatchFlowIdRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 验证码
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
    * 流程(目录) id
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 手机号 
     * @return Mobile 手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号
     * @param Mobile 手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 验证码 
     * @return VerifyCode 验证码
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 验证码
     * @param VerifyCode 验证码
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    /**
     * Get 流程(目录) id 
     * @return FlowId 流程(目录) id
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程(目录) id
     * @param FlowId 流程(目录) id
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    public CheckVerifyCodeMatchFlowIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckVerifyCodeMatchFlowIdRequest(CheckVerifyCodeMatchFlowIdRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

