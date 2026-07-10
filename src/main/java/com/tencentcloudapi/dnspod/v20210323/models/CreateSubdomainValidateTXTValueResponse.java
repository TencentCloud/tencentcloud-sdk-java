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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubdomainValidateTXTValueResponse extends AbstractModel {

    /**
    * <p>需要添加 TXT 记录的主域名。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>需要添加 TXT 记录的主机记录。</p>
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * <p>需要添加记录类型。</p>
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * <p>需要添加 TXT 记录的记录值。</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>需要添加 TXT 记录的上级域名(可选，主域名和上级域名任选一个添加即可)。</p>
    */
    @SerializedName("ParentDomain")
    @Expose
    private String ParentDomain;

    /**
    * <p>需要添加 TXT 记录的主机记录。</p><p>新增规范参数，建议优先使用SubDomain参数</p>
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>需要添加 TXT 记录的主域名。</p> 
     * @return Domain <p>需要添加 TXT 记录的主域名。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>需要添加 TXT 记录的主域名。</p>
     * @param Domain <p>需要添加 TXT 记录的主域名。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>需要添加 TXT 记录的主机记录。</p> 
     * @return Subdomain <p>需要添加 TXT 记录的主机记录。</p>
     * @deprecated
     */
    @Deprecated
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set <p>需要添加 TXT 记录的主机记录。</p>
     * @param Subdomain <p>需要添加 TXT 记录的主机记录。</p>
     * @deprecated
     */
    @Deprecated
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get <p>需要添加记录类型。</p> 
     * @return RecordType <p>需要添加记录类型。</p>
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set <p>需要添加记录类型。</p>
     * @param RecordType <p>需要添加记录类型。</p>
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get <p>需要添加 TXT 记录的记录值。</p> 
     * @return Value <p>需要添加 TXT 记录的记录值。</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>需要添加 TXT 记录的记录值。</p>
     * @param Value <p>需要添加 TXT 记录的记录值。</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>需要添加 TXT 记录的上级域名(可选，主域名和上级域名任选一个添加即可)。</p> 
     * @return ParentDomain <p>需要添加 TXT 记录的上级域名(可选，主域名和上级域名任选一个添加即可)。</p>
     */
    public String getParentDomain() {
        return this.ParentDomain;
    }

    /**
     * Set <p>需要添加 TXT 记录的上级域名(可选，主域名和上级域名任选一个添加即可)。</p>
     * @param ParentDomain <p>需要添加 TXT 记录的上级域名(可选，主域名和上级域名任选一个添加即可)。</p>
     */
    public void setParentDomain(String ParentDomain) {
        this.ParentDomain = ParentDomain;
    }

    /**
     * Get <p>需要添加 TXT 记录的主机记录。</p><p>新增规范参数，建议优先使用SubDomain参数</p> 
     * @return SubDomain <p>需要添加 TXT 记录的主机记录。</p><p>新增规范参数，建议优先使用SubDomain参数</p>
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set <p>需要添加 TXT 记录的主机记录。</p><p>新增规范参数，建议优先使用SubDomain参数</p>
     * @param SubDomain <p>需要添加 TXT 记录的主机记录。</p><p>新增规范参数，建议优先使用SubDomain参数</p>
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
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
        if (source.ParentDomain != null) {
            this.ParentDomain = new String(source.ParentDomain);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
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
        this.setParamSimple(map, prefix + "ParentDomain", this.ParentDomain);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

