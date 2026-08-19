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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelQuotaResponse extends AbstractModel {

    /**
    * <p>模型 ID。</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>TPM 限制（Tokens Per Minute）。模型无配额配置时不返回此字段。</p>
    */
    @SerializedName("TPMLimit")
    @Expose
    private Long TPMLimit;

    /**
    * <p>RPM 限制（Request Per Minute）。模型无配额配置时不返回此字段。</p>
    */
    @SerializedName("RPMLimit")
    @Expose
    private Long RPMLimit;

    /**
    * <p>TPM 保障包 input 配额</p>
    */
    @SerializedName("TPMInputQuotaLimit")
    @Expose
    private Long TPMInputQuotaLimit;

    /**
    * <p>TPM 保障包 output 配额</p>
    */
    @SerializedName("TPMOutputQuotaLimit")
    @Expose
    private Long TPMOutputQuotaLimit;

    /**
    * <p>TPM 预留 input 配额</p>
    */
    @SerializedName("TPMInputReserveLimit")
    @Expose
    private Long TPMInputReserveLimit;

    /**
    * <p>TPM 预留 output 配额</p>
    */
    @SerializedName("TPMOutputReserveLimit")
    @Expose
    private Long TPMOutputReserveLimit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>模型 ID。</p> 
     * @return ModelId <p>模型 ID。</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型 ID。</p>
     * @param ModelId <p>模型 ID。</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>TPM 限制（Tokens Per Minute）。模型无配额配置时不返回此字段。</p> 
     * @return TPMLimit <p>TPM 限制（Tokens Per Minute）。模型无配额配置时不返回此字段。</p>
     */
    public Long getTPMLimit() {
        return this.TPMLimit;
    }

    /**
     * Set <p>TPM 限制（Tokens Per Minute）。模型无配额配置时不返回此字段。</p>
     * @param TPMLimit <p>TPM 限制（Tokens Per Minute）。模型无配额配置时不返回此字段。</p>
     */
    public void setTPMLimit(Long TPMLimit) {
        this.TPMLimit = TPMLimit;
    }

    /**
     * Get <p>RPM 限制（Request Per Minute）。模型无配额配置时不返回此字段。</p> 
     * @return RPMLimit <p>RPM 限制（Request Per Minute）。模型无配额配置时不返回此字段。</p>
     */
    public Long getRPMLimit() {
        return this.RPMLimit;
    }

    /**
     * Set <p>RPM 限制（Request Per Minute）。模型无配额配置时不返回此字段。</p>
     * @param RPMLimit <p>RPM 限制（Request Per Minute）。模型无配额配置时不返回此字段。</p>
     */
    public void setRPMLimit(Long RPMLimit) {
        this.RPMLimit = RPMLimit;
    }

    /**
     * Get <p>TPM 保障包 input 配额</p> 
     * @return TPMInputQuotaLimit <p>TPM 保障包 input 配额</p>
     */
    public Long getTPMInputQuotaLimit() {
        return this.TPMInputQuotaLimit;
    }

    /**
     * Set <p>TPM 保障包 input 配额</p>
     * @param TPMInputQuotaLimit <p>TPM 保障包 input 配额</p>
     */
    public void setTPMInputQuotaLimit(Long TPMInputQuotaLimit) {
        this.TPMInputQuotaLimit = TPMInputQuotaLimit;
    }

    /**
     * Get <p>TPM 保障包 output 配额</p> 
     * @return TPMOutputQuotaLimit <p>TPM 保障包 output 配额</p>
     */
    public Long getTPMOutputQuotaLimit() {
        return this.TPMOutputQuotaLimit;
    }

    /**
     * Set <p>TPM 保障包 output 配额</p>
     * @param TPMOutputQuotaLimit <p>TPM 保障包 output 配额</p>
     */
    public void setTPMOutputQuotaLimit(Long TPMOutputQuotaLimit) {
        this.TPMOutputQuotaLimit = TPMOutputQuotaLimit;
    }

    /**
     * Get <p>TPM 预留 input 配额</p> 
     * @return TPMInputReserveLimit <p>TPM 预留 input 配额</p>
     */
    public Long getTPMInputReserveLimit() {
        return this.TPMInputReserveLimit;
    }

    /**
     * Set <p>TPM 预留 input 配额</p>
     * @param TPMInputReserveLimit <p>TPM 预留 input 配额</p>
     */
    public void setTPMInputReserveLimit(Long TPMInputReserveLimit) {
        this.TPMInputReserveLimit = TPMInputReserveLimit;
    }

    /**
     * Get <p>TPM 预留 output 配额</p> 
     * @return TPMOutputReserveLimit <p>TPM 预留 output 配额</p>
     */
    public Long getTPMOutputReserveLimit() {
        return this.TPMOutputReserveLimit;
    }

    /**
     * Set <p>TPM 预留 output 配额</p>
     * @param TPMOutputReserveLimit <p>TPM 预留 output 配额</p>
     */
    public void setTPMOutputReserveLimit(Long TPMOutputReserveLimit) {
        this.TPMOutputReserveLimit = TPMOutputReserveLimit;
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

    public DescribeModelQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelQuotaResponse(DescribeModelQuotaResponse source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.TPMLimit != null) {
            this.TPMLimit = new Long(source.TPMLimit);
        }
        if (source.RPMLimit != null) {
            this.RPMLimit = new Long(source.RPMLimit);
        }
        if (source.TPMInputQuotaLimit != null) {
            this.TPMInputQuotaLimit = new Long(source.TPMInputQuotaLimit);
        }
        if (source.TPMOutputQuotaLimit != null) {
            this.TPMOutputQuotaLimit = new Long(source.TPMOutputQuotaLimit);
        }
        if (source.TPMInputReserveLimit != null) {
            this.TPMInputReserveLimit = new Long(source.TPMInputReserveLimit);
        }
        if (source.TPMOutputReserveLimit != null) {
            this.TPMOutputReserveLimit = new Long(source.TPMOutputReserveLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "TPMLimit", this.TPMLimit);
        this.setParamSimple(map, prefix + "RPMLimit", this.RPMLimit);
        this.setParamSimple(map, prefix + "TPMInputQuotaLimit", this.TPMInputQuotaLimit);
        this.setParamSimple(map, prefix + "TPMOutputQuotaLimit", this.TPMOutputQuotaLimit);
        this.setParamSimple(map, prefix + "TPMInputReserveLimit", this.TPMInputReserveLimit);
        this.setParamSimple(map, prefix + "TPMOutputReserveLimit", this.TPMOutputReserveLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

