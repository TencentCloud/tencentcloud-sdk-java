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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageDenyRuleSummaryResponse extends AbstractModel {

    /**
    * 镜像拦截规则总数(含关闭的和开启的)
    */
    @SerializedName("RuleTotalCount")
    @Expose
    private Long RuleTotalCount;

    /**
    * 开启的镜像拦截规则数
    */
    @SerializedName("EnabledRuleCount")
    @Expose
    private Long EnabledRuleCount;

    /**
    * 观察期中的镜像拦截规则数
    */
    @SerializedName("ObservedRuleCount")
    @Expose
    private Long ObservedRuleCount;

    /**
    * 已生效的镜像拦截规则数
    */
    @SerializedName("EffectiveRuleCount")
    @Expose
    private Long EffectiveRuleCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像拦截规则总数(含关闭的和开启的) 
     * @return RuleTotalCount 镜像拦截规则总数(含关闭的和开启的)
     */
    public Long getRuleTotalCount() {
        return this.RuleTotalCount;
    }

    /**
     * Set 镜像拦截规则总数(含关闭的和开启的)
     * @param RuleTotalCount 镜像拦截规则总数(含关闭的和开启的)
     */
    public void setRuleTotalCount(Long RuleTotalCount) {
        this.RuleTotalCount = RuleTotalCount;
    }

    /**
     * Get 开启的镜像拦截规则数 
     * @return EnabledRuleCount 开启的镜像拦截规则数
     */
    public Long getEnabledRuleCount() {
        return this.EnabledRuleCount;
    }

    /**
     * Set 开启的镜像拦截规则数
     * @param EnabledRuleCount 开启的镜像拦截规则数
     */
    public void setEnabledRuleCount(Long EnabledRuleCount) {
        this.EnabledRuleCount = EnabledRuleCount;
    }

    /**
     * Get 观察期中的镜像拦截规则数 
     * @return ObservedRuleCount 观察期中的镜像拦截规则数
     */
    public Long getObservedRuleCount() {
        return this.ObservedRuleCount;
    }

    /**
     * Set 观察期中的镜像拦截规则数
     * @param ObservedRuleCount 观察期中的镜像拦截规则数
     */
    public void setObservedRuleCount(Long ObservedRuleCount) {
        this.ObservedRuleCount = ObservedRuleCount;
    }

    /**
     * Get 已生效的镜像拦截规则数 
     * @return EffectiveRuleCount 已生效的镜像拦截规则数
     */
    public Long getEffectiveRuleCount() {
        return this.EffectiveRuleCount;
    }

    /**
     * Set 已生效的镜像拦截规则数
     * @param EffectiveRuleCount 已生效的镜像拦截规则数
     */
    public void setEffectiveRuleCount(Long EffectiveRuleCount) {
        this.EffectiveRuleCount = EffectiveRuleCount;
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

    public DescribeImageDenyRuleSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageDenyRuleSummaryResponse(DescribeImageDenyRuleSummaryResponse source) {
        if (source.RuleTotalCount != null) {
            this.RuleTotalCount = new Long(source.RuleTotalCount);
        }
        if (source.EnabledRuleCount != null) {
            this.EnabledRuleCount = new Long(source.EnabledRuleCount);
        }
        if (source.ObservedRuleCount != null) {
            this.ObservedRuleCount = new Long(source.ObservedRuleCount);
        }
        if (source.EffectiveRuleCount != null) {
            this.EffectiveRuleCount = new Long(source.EffectiveRuleCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTotalCount", this.RuleTotalCount);
        this.setParamSimple(map, prefix + "EnabledRuleCount", this.EnabledRuleCount);
        this.setParamSimple(map, prefix + "ObservedRuleCount", this.ObservedRuleCount);
        this.setParamSimple(map, prefix + "EffectiveRuleCount", this.EffectiveRuleCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

