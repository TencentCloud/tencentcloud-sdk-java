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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthRecord extends AbstractModel {

    /**
    * 经办人姓名。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 经办人手机号。
    */
    @SerializedName("OperatorMobile")
    @Expose
    private String OperatorMobile;

    /**
    * 认证授权方式：
<ul><li> **0**：未选择授权方式（默认值）</li>
<li> **1**：上传授权书</li>
<li> **2**：法人授权</li>
<li> **3**：法人认证</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 企业认证授权书审核状态：
<ul><li> **0**：未提交授权书（默认值）</li>
<li> **1**：审核通过</li>
<li> **2**：审核驳回</li>
<li> **3**：审核中</li>
<li> **4**：AI识别中</li>
<li> **5**：客户确认AI信息</li></ul>
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
     * Get 经办人姓名。 
     * @return OperatorName 经办人姓名。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 经办人姓名。
     * @param OperatorName 经办人姓名。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 经办人手机号。 
     * @return OperatorMobile 经办人手机号。
     */
    public String getOperatorMobile() {
        return this.OperatorMobile;
    }

    /**
     * Set 经办人手机号。
     * @param OperatorMobile 经办人手机号。
     */
    public void setOperatorMobile(String OperatorMobile) {
        this.OperatorMobile = OperatorMobile;
    }

    /**
     * Get 认证授权方式：
<ul><li> **0**：未选择授权方式（默认值）</li>
<li> **1**：上传授权书</li>
<li> **2**：法人授权</li>
<li> **3**：法人认证</li></ul> 
     * @return AuthType 认证授权方式：
<ul><li> **0**：未选择授权方式（默认值）</li>
<li> **1**：上传授权书</li>
<li> **2**：法人授权</li>
<li> **3**：法人认证</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证授权方式：
<ul><li> **0**：未选择授权方式（默认值）</li>
<li> **1**：上传授权书</li>
<li> **2**：法人授权</li>
<li> **3**：法人认证</li></ul>
     * @param AuthType 认证授权方式：
<ul><li> **0**：未选择授权方式（默认值）</li>
<li> **1**：上传授权书</li>
<li> **2**：法人授权</li>
<li> **3**：法人认证</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 企业认证授权书审核状态：
<ul><li> **0**：未提交授权书（默认值）</li>
<li> **1**：审核通过</li>
<li> **2**：审核驳回</li>
<li> **3**：审核中</li>
<li> **4**：AI识别中</li>
<li> **5**：客户确认AI信息</li></ul> 
     * @return AuditStatus 企业认证授权书审核状态：
<ul><li> **0**：未提交授权书（默认值）</li>
<li> **1**：审核通过</li>
<li> **2**：审核驳回</li>
<li> **3**：审核中</li>
<li> **4**：AI识别中</li>
<li> **5**：客户确认AI信息</li></ul>
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 企业认证授权书审核状态：
<ul><li> **0**：未提交授权书（默认值）</li>
<li> **1**：审核通过</li>
<li> **2**：审核驳回</li>
<li> **3**：审核中</li>
<li> **4**：AI识别中</li>
<li> **5**：客户确认AI信息</li></ul>
     * @param AuditStatus 企业认证授权书审核状态：
<ul><li> **0**：未提交授权书（默认值）</li>
<li> **1**：审核通过</li>
<li> **2**：审核驳回</li>
<li> **3**：审核中</li>
<li> **4**：AI识别中</li>
<li> **5**：客户确认AI信息</li></ul>
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    public AuthRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthRecord(AuthRecord source) {
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.OperatorMobile != null) {
            this.OperatorMobile = new String(source.OperatorMobile);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "OperatorMobile", this.OperatorMobile);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);

    }
}

