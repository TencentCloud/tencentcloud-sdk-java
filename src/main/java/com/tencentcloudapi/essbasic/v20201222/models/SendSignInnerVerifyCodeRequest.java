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

public class SendSignInnerVerifyCodeRequest extends AbstractModel{

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
    * 验证码类型，取值(SIGN)
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 用户 id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 模板 id
    */
    @SerializedName("VerifyTemplateId")
    @Expose
    private String VerifyTemplateId;

    /**
    * 签名
    */
    @SerializedName("VerifySign")
    @Expose
    private String VerifySign;

    /**
    * 流程(目录) id
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 三要素检测结果
    */
    @SerializedName("CheckThreeElementResult")
    @Expose
    private Long CheckThreeElementResult;

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
     * Get 验证码类型，取值(SIGN) 
     * @return VerifyType 验证码类型，取值(SIGN)
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证码类型，取值(SIGN)
     * @param VerifyType 验证码类型，取值(SIGN)
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 用户 id 
     * @return UserId 用户 id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 id
     * @param UserId 用户 id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 模板 id 
     * @return VerifyTemplateId 模板 id
     */
    public String getVerifyTemplateId() {
        return this.VerifyTemplateId;
    }

    /**
     * Set 模板 id
     * @param VerifyTemplateId 模板 id
     */
    public void setVerifyTemplateId(String VerifyTemplateId) {
        this.VerifyTemplateId = VerifyTemplateId;
    }

    /**
     * Get 签名 
     * @return VerifySign 签名
     */
    public String getVerifySign() {
        return this.VerifySign;
    }

    /**
     * Set 签名
     * @param VerifySign 签名
     */
    public void setVerifySign(String VerifySign) {
        this.VerifySign = VerifySign;
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

    /**
     * Get 三要素检测结果 
     * @return CheckThreeElementResult 三要素检测结果
     */
    public Long getCheckThreeElementResult() {
        return this.CheckThreeElementResult;
    }

    /**
     * Set 三要素检测结果
     * @param CheckThreeElementResult 三要素检测结果
     */
    public void setCheckThreeElementResult(Long CheckThreeElementResult) {
        this.CheckThreeElementResult = CheckThreeElementResult;
    }

    public SendSignInnerVerifyCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendSignInnerVerifyCodeRequest(SendSignInnerVerifyCodeRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.VerifyTemplateId != null) {
            this.VerifyTemplateId = new String(source.VerifyTemplateId);
        }
        if (source.VerifySign != null) {
            this.VerifySign = new String(source.VerifySign);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.CheckThreeElementResult != null) {
            this.CheckThreeElementResult = new Long(source.CheckThreeElementResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "VerifyTemplateId", this.VerifyTemplateId);
        this.setParamSimple(map, prefix + "VerifySign", this.VerifySign);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "CheckThreeElementResult", this.CheckThreeElementResult);

    }
}

