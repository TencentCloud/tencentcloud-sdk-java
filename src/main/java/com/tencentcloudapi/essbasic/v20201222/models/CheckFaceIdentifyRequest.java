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

public class CheckFaceIdentifyRequest extends AbstractModel{

    /**
    * 调用方信息; 必选
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 人脸核身渠道; 必选; WEIXINAPP:腾讯电子签小程序,FACEID:腾讯电子签慧眼,None:白名单中的客户直接通过
    */
    @SerializedName("VerifyChannel")
    @Expose
    private String VerifyChannel;

    /**
    * 核身订单号; 必选; 对于WEIXINAPP,直接取响应的{VerifyResult};对于FACEID,使用{WbAppId}:{OrderNo}拼接
    */
    @SerializedName("VerifyResult")
    @Expose
    private String VerifyResult;

    /**
    * 要对比的姓名; 可选; 未填写时对比caller.OperatorId的实名信息
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要对比的身份证号码; 可选; 未填写时对比caller.OperatorId的实名信息
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 是否取认证时的照片
    */
    @SerializedName("GetPhoto")
    @Expose
    private Boolean GetPhoto;

    /**
     * Get 调用方信息; 必选 
     * @return Caller 调用方信息; 必选
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息; 必选
     * @param Caller 调用方信息; 必选
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 人脸核身渠道; 必选; WEIXINAPP:腾讯电子签小程序,FACEID:腾讯电子签慧眼,None:白名单中的客户直接通过 
     * @return VerifyChannel 人脸核身渠道; 必选; WEIXINAPP:腾讯电子签小程序,FACEID:腾讯电子签慧眼,None:白名单中的客户直接通过
     */
    public String getVerifyChannel() {
        return this.VerifyChannel;
    }

    /**
     * Set 人脸核身渠道; 必选; WEIXINAPP:腾讯电子签小程序,FACEID:腾讯电子签慧眼,None:白名单中的客户直接通过
     * @param VerifyChannel 人脸核身渠道; 必选; WEIXINAPP:腾讯电子签小程序,FACEID:腾讯电子签慧眼,None:白名单中的客户直接通过
     */
    public void setVerifyChannel(String VerifyChannel) {
        this.VerifyChannel = VerifyChannel;
    }

    /**
     * Get 核身订单号; 必选; 对于WEIXINAPP,直接取响应的{VerifyResult};对于FACEID,使用{WbAppId}:{OrderNo}拼接 
     * @return VerifyResult 核身订单号; 必选; 对于WEIXINAPP,直接取响应的{VerifyResult};对于FACEID,使用{WbAppId}:{OrderNo}拼接
     */
    public String getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set 核身订单号; 必选; 对于WEIXINAPP,直接取响应的{VerifyResult};对于FACEID,使用{WbAppId}:{OrderNo}拼接
     * @param VerifyResult 核身订单号; 必选; 对于WEIXINAPP,直接取响应的{VerifyResult};对于FACEID,使用{WbAppId}:{OrderNo}拼接
     */
    public void setVerifyResult(String VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get 要对比的姓名; 可选; 未填写时对比caller.OperatorId的实名信息 
     * @return Name 要对比的姓名; 可选; 未填写时对比caller.OperatorId的实名信息
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 要对比的姓名; 可选; 未填写时对比caller.OperatorId的实名信息
     * @param Name 要对比的姓名; 可选; 未填写时对比caller.OperatorId的实名信息
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要对比的身份证号码; 可选; 未填写时对比caller.OperatorId的实名信息 
     * @return IdCardNumber 要对比的身份证号码; 可选; 未填写时对比caller.OperatorId的实名信息
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 要对比的身份证号码; 可选; 未填写时对比caller.OperatorId的实名信息
     * @param IdCardNumber 要对比的身份证号码; 可选; 未填写时对比caller.OperatorId的实名信息
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 是否取认证时的照片 
     * @return GetPhoto 是否取认证时的照片
     */
    public Boolean getGetPhoto() {
        return this.GetPhoto;
    }

    /**
     * Set 是否取认证时的照片
     * @param GetPhoto 是否取认证时的照片
     */
    public void setGetPhoto(Boolean GetPhoto) {
        this.GetPhoto = GetPhoto;
    }

    public CheckFaceIdentifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckFaceIdentifyRequest(CheckFaceIdentifyRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.VerifyChannel != null) {
            this.VerifyChannel = new String(source.VerifyChannel);
        }
        if (source.VerifyResult != null) {
            this.VerifyResult = new String(source.VerifyResult);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.GetPhoto != null) {
            this.GetPhoto = new Boolean(source.GetPhoto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "VerifyChannel", this.VerifyChannel);
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "GetPhoto", this.GetPhoto);

    }
}

