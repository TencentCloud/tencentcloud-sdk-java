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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverInfo extends AbstractModel{

    /**
    * 签署人姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署人手机号，脱敏显示
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 经办人身份证号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 签署完前端跳转的url，暂未使用
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 签署截止时间
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 签署完回调url
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 签署人类型，PERSON和ORGANIZATION
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 用户侧第三方id
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get 签署人姓名 
     * @return Name 签署人姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名
     * @param Name 签署人姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署人手机号，脱敏显示 
     * @return Mobile 签署人手机号，脱敏显示
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号，脱敏显示
     * @param Mobile 签署人手机号，脱敏显示
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 经办人身份证号 
     * @return IdCardNumber 经办人身份证号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 经办人身份证号
     * @param IdCardNumber 经办人身份证号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 签署完前端跳转的url，暂未使用 
     * @return JumpUrl 签署完前端跳转的url，暂未使用
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完前端跳转的url，暂未使用
     * @param JumpUrl 签署完前端跳转的url，暂未使用
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 签署截止时间 
     * @return Deadline 签署截止时间
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署截止时间
     * @param Deadline 签署截止时间
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 签署完回调url 
     * @return CallbackUrl 签署完回调url
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署完回调url
     * @param CallbackUrl 签署完回调url
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 签署人类型，PERSON和ORGANIZATION 
     * @return ApproverType 签署人类型，PERSON和ORGANIZATION
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 签署人类型，PERSON和ORGANIZATION
     * @param ApproverType 签署人类型，PERSON和ORGANIZATION
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 用户侧第三方id 
     * @return OpenId 用户侧第三方id
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户侧第三方id
     * @param OpenId 用户侧第三方id
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    public FlowApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverInfo(FlowApproverInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

