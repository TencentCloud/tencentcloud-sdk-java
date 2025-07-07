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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserSAMLConfigResponse extends AbstractModel {

    /**
    * SAML元数据文档
    */
    @SerializedName("SAMLMetadata")
    @Expose
    private String SAMLMetadata;

    /**
    * 状态：0:未设置，11:已开启，2:已禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 辅助域名
    */
    @SerializedName("AuxiliaryDomain")
    @Expose
    private String AuxiliaryDomain;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SAML元数据文档 
     * @return SAMLMetadata SAML元数据文档
     */
    public String getSAMLMetadata() {
        return this.SAMLMetadata;
    }

    /**
     * Set SAML元数据文档
     * @param SAMLMetadata SAML元数据文档
     */
    public void setSAMLMetadata(String SAMLMetadata) {
        this.SAMLMetadata = SAMLMetadata;
    }

    /**
     * Get 状态：0:未设置，11:已开启，2:已禁用 
     * @return Status 状态：0:未设置，11:已开启，2:已禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0:未设置，11:已开启，2:已禁用
     * @param Status 状态：0:未设置，11:已开启，2:已禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 辅助域名 
     * @return AuxiliaryDomain 辅助域名
     */
    public String getAuxiliaryDomain() {
        return this.AuxiliaryDomain;
    }

    /**
     * Set 辅助域名
     * @param AuxiliaryDomain 辅助域名
     */
    public void setAuxiliaryDomain(String AuxiliaryDomain) {
        this.AuxiliaryDomain = AuxiliaryDomain;
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

    public DescribeUserSAMLConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserSAMLConfigResponse(DescribeUserSAMLConfigResponse source) {
        if (source.SAMLMetadata != null) {
            this.SAMLMetadata = new String(source.SAMLMetadata);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AuxiliaryDomain != null) {
            this.AuxiliaryDomain = new String(source.AuxiliaryDomain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SAMLMetadata", this.SAMLMetadata);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuxiliaryDomain", this.AuxiliaryDomain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

