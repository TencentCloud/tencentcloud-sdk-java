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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelRouterGuardrailsResponse extends AbstractModel {

    /**
    * <p>当前已关联的 Guardrail 防护配置列表。</p><p>当前最多返回 1 个元素。</p>
    */
    @SerializedName("Guardrails")
    @Expose
    private GuardrailConfig [] Guardrails;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>当前已关联的 Guardrail 防护配置列表。</p><p>当前最多返回 1 个元素。</p> 
     * @return Guardrails <p>当前已关联的 Guardrail 防护配置列表。</p><p>当前最多返回 1 个元素。</p>
     */
    public GuardrailConfig [] getGuardrails() {
        return this.Guardrails;
    }

    /**
     * Set <p>当前已关联的 Guardrail 防护配置列表。</p><p>当前最多返回 1 个元素。</p>
     * @param Guardrails <p>当前已关联的 Guardrail 防护配置列表。</p><p>当前最多返回 1 个元素。</p>
     */
    public void setGuardrails(GuardrailConfig [] Guardrails) {
        this.Guardrails = Guardrails;
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

    public DescribeModelRouterGuardrailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelRouterGuardrailsResponse(DescribeModelRouterGuardrailsResponse source) {
        if (source.Guardrails != null) {
            this.Guardrails = new GuardrailConfig[source.Guardrails.length];
            for (int i = 0; i < source.Guardrails.length; i++) {
                this.Guardrails[i] = new GuardrailConfig(source.Guardrails[i]);
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
        this.setParamArrayObj(map, prefix + "Guardrails.", this.Guardrails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

