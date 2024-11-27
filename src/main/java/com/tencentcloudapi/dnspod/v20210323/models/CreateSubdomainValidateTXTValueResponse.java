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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubdomainValidateTXTValueResponse extends AbstractModel {

    /**
    * 需要添加 TXT 记录的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 需要添加 TXT 记录的主机记录。
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * 需要添加记录类型。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 需要添加 TXT 记录的记录值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 需要添加 TXT 记录的域名。 
     * @return Domain 需要添加 TXT 记录的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要添加 TXT 记录的域名。
     * @param Domain 需要添加 TXT 记录的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 需要添加 TXT 记录的主机记录。 
     * @return Subdomain 需要添加 TXT 记录的主机记录。
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 需要添加 TXT 记录的主机记录。
     * @param Subdomain 需要添加 TXT 记录的主机记录。
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get 需要添加记录类型。 
     * @return RecordType 需要添加记录类型。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 需要添加记录类型。
     * @param RecordType 需要添加记录类型。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 需要添加 TXT 记录的记录值。 
     * @return Value 需要添加 TXT 记录的记录值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 需要添加 TXT 记录的记录值。
     * @param Value 需要添加 TXT 记录的记录值。
     */
    public void setValue(String Value) {
        this.Value = Value;
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

    public CreateSubdomainValidateTXTValueResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubdomainValidateTXTValueResponse(CreateSubdomainValidateTXTValueResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

