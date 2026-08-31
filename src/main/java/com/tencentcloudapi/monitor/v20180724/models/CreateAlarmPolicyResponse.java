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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmPolicyResponse extends AbstractModel {

    /**
    * <p>告警策略 ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>可用于实例、实例组的绑定和解绑接口（<a href="https://cloud.tencent.com/document/product/248/40421">BindingPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40568">UnBindingAllPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40567">UnBindingPolicyObject</a>）的策略 ID</p>
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>告警策略 ID</p> 
     * @return PolicyId <p>告警策略 ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>告警策略 ID</p>
     * @param PolicyId <p>告警策略 ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>可用于实例、实例组的绑定和解绑接口（<a href="https://cloud.tencent.com/document/product/248/40421">BindingPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40568">UnBindingAllPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40567">UnBindingPolicyObject</a>）的策略 ID</p> 
     * @return OriginId <p>可用于实例、实例组的绑定和解绑接口（<a href="https://cloud.tencent.com/document/product/248/40421">BindingPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40568">UnBindingAllPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40567">UnBindingPolicyObject</a>）的策略 ID</p>
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set <p>可用于实例、实例组的绑定和解绑接口（<a href="https://cloud.tencent.com/document/product/248/40421">BindingPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40568">UnBindingAllPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40567">UnBindingPolicyObject</a>）的策略 ID</p>
     * @param OriginId <p>可用于实例、实例组的绑定和解绑接口（<a href="https://cloud.tencent.com/document/product/248/40421">BindingPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40568">UnBindingAllPolicyObject</a>、<a href="https://cloud.tencent.com/document/product/248/40567">UnBindingPolicyObject</a>）的策略 ID</p>
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
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

    public CreateAlarmPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmPolicyResponse(CreateAlarmPolicyResponse source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

