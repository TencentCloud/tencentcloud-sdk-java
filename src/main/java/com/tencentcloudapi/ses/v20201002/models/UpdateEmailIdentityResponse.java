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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEmailIdentityResponse extends AbstractModel{

    /**
    * 验证类型。固定值：DOMAIN
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * 是否已通过验证
    */
    @SerializedName("VerifiedForSendingStatus")
    @Expose
    private Boolean VerifiedForSendingStatus;

    /**
    * 需要配置的DNS信息
    */
    @SerializedName("Attributes")
    @Expose
    private DNSAttributes [] Attributes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证类型。固定值：DOMAIN 
     * @return IdentityType 验证类型。固定值：DOMAIN
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set 验证类型。固定值：DOMAIN
     * @param IdentityType 验证类型。固定值：DOMAIN
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get 是否已通过验证 
     * @return VerifiedForSendingStatus 是否已通过验证
     */
    public Boolean getVerifiedForSendingStatus() {
        return this.VerifiedForSendingStatus;
    }

    /**
     * Set 是否已通过验证
     * @param VerifiedForSendingStatus 是否已通过验证
     */
    public void setVerifiedForSendingStatus(Boolean VerifiedForSendingStatus) {
        this.VerifiedForSendingStatus = VerifiedForSendingStatus;
    }

    /**
     * Get 需要配置的DNS信息 
     * @return Attributes 需要配置的DNS信息
     */
    public DNSAttributes [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 需要配置的DNS信息
     * @param Attributes 需要配置的DNS信息
     */
    public void setAttributes(DNSAttributes [] Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UpdateEmailIdentityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEmailIdentityResponse(UpdateEmailIdentityResponse source) {
        if (source.IdentityType != null) {
            this.IdentityType = new String(source.IdentityType);
        }
        if (source.VerifiedForSendingStatus != null) {
            this.VerifiedForSendingStatus = new Boolean(source.VerifiedForSendingStatus);
        }
        if (source.Attributes != null) {
            this.Attributes = new DNSAttributes[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new DNSAttributes(source.Attributes[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "VerifiedForSendingStatus", this.VerifiedForSendingStatus);
        this.setParamArrayObj(map, prefix + "Attributes.", this.Attributes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

