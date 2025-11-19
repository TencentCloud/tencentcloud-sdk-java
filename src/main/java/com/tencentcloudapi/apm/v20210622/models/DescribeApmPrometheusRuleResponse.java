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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmPrometheusRuleResponse extends AbstractModel {

    /**
    * 指标匹配规则
    */
    @SerializedName("ApmPrometheusRules")
    @Expose
    private ApmPrometheusRules [] ApmPrometheusRules;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 指标匹配规则 
     * @return ApmPrometheusRules 指标匹配规则
     */
    public ApmPrometheusRules [] getApmPrometheusRules() {
        return this.ApmPrometheusRules;
    }

    /**
     * Set 指标匹配规则
     * @param ApmPrometheusRules 指标匹配规则
     */
    public void setApmPrometheusRules(ApmPrometheusRules [] ApmPrometheusRules) {
        this.ApmPrometheusRules = ApmPrometheusRules;
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

    public DescribeApmPrometheusRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmPrometheusRuleResponse(DescribeApmPrometheusRuleResponse source) {
        if (source.ApmPrometheusRules != null) {
            this.ApmPrometheusRules = new ApmPrometheusRules[source.ApmPrometheusRules.length];
            for (int i = 0; i < source.ApmPrometheusRules.length; i++) {
                this.ApmPrometheusRules[i] = new ApmPrometheusRules(source.ApmPrometheusRules[i]);
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
        this.setParamArrayObj(map, prefix + "ApmPrometheusRules.", this.ApmPrometheusRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

