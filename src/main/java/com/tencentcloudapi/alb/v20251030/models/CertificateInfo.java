/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInfo extends AbstractModel {

    /**
    * 证书绑定时间。
    */
    @SerializedName("AssociatedTime")
    @Expose
    private String AssociatedTime;

    /**
    * 证书 ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 证书类型。取值：CA或SVR（服务器证书）。
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * 是否为监听器默认证书。取值：
true：默认证书。
false：扩展证书。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 证书与监听器的绑定状态。取值：Associated（已关联）、Associating（关联中）、Disassociating（解除关联中）、Error（异常）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 证书绑定时间。 
     * @return AssociatedTime 证书绑定时间。
     */
    public String getAssociatedTime() {
        return this.AssociatedTime;
    }

    /**
     * Set 证书绑定时间。
     * @param AssociatedTime 证书绑定时间。
     */
    public void setAssociatedTime(String AssociatedTime) {
        this.AssociatedTime = AssociatedTime;
    }

    /**
     * Get 证书 ID。 
     * @return CertificateId 证书 ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书 ID。
     * @param CertificateId 证书 ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 证书类型。取值：CA或SVR（服务器证书）。 
     * @return CertificateType 证书类型。取值：CA或SVR（服务器证书）。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证书类型。取值：CA或SVR（服务器证书）。
     * @param CertificateType 证书类型。取值：CA或SVR（服务器证书）。
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get 是否为监听器默认证书。取值：
true：默认证书。
false：扩展证书。 
     * @return IsDefault 是否为监听器默认证书。取值：
true：默认证书。
false：扩展证书。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为监听器默认证书。取值：
true：默认证书。
false：扩展证书。
     * @param IsDefault 是否为监听器默认证书。取值：
true：默认证书。
false：扩展证书。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 证书与监听器的绑定状态。取值：Associated（已关联）、Associating（关联中）、Disassociating（解除关联中）、Error（异常）。 
     * @return Status 证书与监听器的绑定状态。取值：Associated（已关联）、Associating（关联中）、Disassociating（解除关联中）、Error（异常）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 证书与监听器的绑定状态。取值：Associated（已关联）、Associating（关联中）、Disassociating（解除关联中）、Error（异常）。
     * @param Status 证书与监听器的绑定状态。取值：Associated（已关联）、Associating（关联中）、Disassociating（解除关联中）、Error（异常）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CertificateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfo(CertificateInfo source) {
        if (source.AssociatedTime != null) {
            this.AssociatedTime = new String(source.AssociatedTime);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssociatedTime", this.AssociatedTime);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

