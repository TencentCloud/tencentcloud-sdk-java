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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcnVpcFwPolicyLimitResponse extends AbstractModel {

    /**
    * 支持的引流策略数量（最外层总条数）
    */
    @SerializedName("CcnPolicyInterconnectPairLenLimit")
    @Expose
    private Long CcnPolicyInterconnectPairLenLimit;

    /**
    * 单条引流策略中单组的最大配置数量（内层单组总条数）
    */
    @SerializedName("CcnPolicyGroupLenLimit")
    @Expose
    private Long CcnPolicyGroupLenLimit;

    /**
    * 接入的实例网段长度（网段数量）限制
    */
    @SerializedName("CcnPolicyCidrLenLimit")
    @Expose
    private Long CcnPolicyCidrLenLimit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支持的引流策略数量（最外层总条数） 
     * @return CcnPolicyInterconnectPairLenLimit 支持的引流策略数量（最外层总条数）
     */
    public Long getCcnPolicyInterconnectPairLenLimit() {
        return this.CcnPolicyInterconnectPairLenLimit;
    }

    /**
     * Set 支持的引流策略数量（最外层总条数）
     * @param CcnPolicyInterconnectPairLenLimit 支持的引流策略数量（最外层总条数）
     */
    public void setCcnPolicyInterconnectPairLenLimit(Long CcnPolicyInterconnectPairLenLimit) {
        this.CcnPolicyInterconnectPairLenLimit = CcnPolicyInterconnectPairLenLimit;
    }

    /**
     * Get 单条引流策略中单组的最大配置数量（内层单组总条数） 
     * @return CcnPolicyGroupLenLimit 单条引流策略中单组的最大配置数量（内层单组总条数）
     */
    public Long getCcnPolicyGroupLenLimit() {
        return this.CcnPolicyGroupLenLimit;
    }

    /**
     * Set 单条引流策略中单组的最大配置数量（内层单组总条数）
     * @param CcnPolicyGroupLenLimit 单条引流策略中单组的最大配置数量（内层单组总条数）
     */
    public void setCcnPolicyGroupLenLimit(Long CcnPolicyGroupLenLimit) {
        this.CcnPolicyGroupLenLimit = CcnPolicyGroupLenLimit;
    }

    /**
     * Get 接入的实例网段长度（网段数量）限制 
     * @return CcnPolicyCidrLenLimit 接入的实例网段长度（网段数量）限制
     */
    public Long getCcnPolicyCidrLenLimit() {
        return this.CcnPolicyCidrLenLimit;
    }

    /**
     * Set 接入的实例网段长度（网段数量）限制
     * @param CcnPolicyCidrLenLimit 接入的实例网段长度（网段数量）限制
     */
    public void setCcnPolicyCidrLenLimit(Long CcnPolicyCidrLenLimit) {
        this.CcnPolicyCidrLenLimit = CcnPolicyCidrLenLimit;
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

    public DescribeCcnVpcFwPolicyLimitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcnVpcFwPolicyLimitResponse(DescribeCcnVpcFwPolicyLimitResponse source) {
        if (source.CcnPolicyInterconnectPairLenLimit != null) {
            this.CcnPolicyInterconnectPairLenLimit = new Long(source.CcnPolicyInterconnectPairLenLimit);
        }
        if (source.CcnPolicyGroupLenLimit != null) {
            this.CcnPolicyGroupLenLimit = new Long(source.CcnPolicyGroupLenLimit);
        }
        if (source.CcnPolicyCidrLenLimit != null) {
            this.CcnPolicyCidrLenLimit = new Long(source.CcnPolicyCidrLenLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnPolicyInterconnectPairLenLimit", this.CcnPolicyInterconnectPairLenLimit);
        this.setParamSimple(map, prefix + "CcnPolicyGroupLenLimit", this.CcnPolicyGroupLenLimit);
        this.setParamSimple(map, prefix + "CcnPolicyCidrLenLimit", this.CcnPolicyCidrLenLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

