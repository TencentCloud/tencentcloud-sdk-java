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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEmailIdentityResponse extends AbstractModel {

    /**
    * <p>验证类型。固定值：DOMAIN</p>
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * <p>是否已通过验证</p>
    */
    @SerializedName("VerifiedForSendingStatus")
    @Expose
    private Boolean VerifiedForSendingStatus;

    /**
    * <p>需要配置的DNS信息</p>
    */
    @SerializedName("Attributes")
    @Expose
    private DNSAttributes [] Attributes;

    /**
    * <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul>
    */
    @SerializedName("DKIMOption")
    @Expose
    private Long DKIMOption;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>验证类型。固定值：DOMAIN</p> 
     * @return IdentityType <p>验证类型。固定值：DOMAIN</p>
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set <p>验证类型。固定值：DOMAIN</p>
     * @param IdentityType <p>验证类型。固定值：DOMAIN</p>
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get <p>是否已通过验证</p> 
     * @return VerifiedForSendingStatus <p>是否已通过验证</p>
     */
    public Boolean getVerifiedForSendingStatus() {
        return this.VerifiedForSendingStatus;
    }

    /**
     * Set <p>是否已通过验证</p>
     * @param VerifiedForSendingStatus <p>是否已通过验证</p>
     */
    public void setVerifiedForSendingStatus(Boolean VerifiedForSendingStatus) {
        this.VerifiedForSendingStatus = VerifiedForSendingStatus;
    }

    /**
     * Get <p>需要配置的DNS信息</p> 
     * @return Attributes <p>需要配置的DNS信息</p>
     */
    public DNSAttributes [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set <p>需要配置的DNS信息</p>
     * @param Attributes <p>需要配置的DNS信息</p>
     */
    public void setAttributes(DNSAttributes [] Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul> 
     * @return DKIMOption <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul>
     */
    public Long getDKIMOption() {
        return this.DKIMOption;
    }

    /**
     * Set <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul>
     * @param DKIMOption <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul>
     */
    public void setDKIMOption(Long DKIMOption) {
        this.DKIMOption = DKIMOption;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
        if (source.DKIMOption != null) {
            this.DKIMOption = new Long(source.DKIMOption);
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
        this.setParamSimple(map, prefix + "DKIMOption", this.DKIMOption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

